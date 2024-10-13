import java.util.*;

public class VotingSystem {

    private List<VoterAcc> voter;
    private List<Kandidat> kandidat;
    private List<Vote> vote;

    public VotingSystem() {
        voter = new ArrayList<>();
        kandidat = new ArrayList<>();
        vote = new ArrayList<>();
    }

    public void addVoter(VoterAcc voter) {
        this.voter.add(voter);
    }

    public void addKandidat(Kandidat kandidat) {
        this.kandidat.add(kandidat);
    }

    public void addVote(Vote vote) {
        this.vote.add(vote);
    }

    public List<VoterAcc> getVoter() {
        return voter;
    }

    public List<Kandidat> getKandidat() {
        return kandidat;
    }

    public Kandidat getKandidatById(int id) {
        for (Kandidat kandidat : kandidat) {
            if (kandidat.getId() == id) {
                return kandidat;
            }
        }
        return null;
    }

    public void updateVoter(int idVoter, String newName, String newUsername, String newPassword, int newAge) {
        for (VoterAcc voter : getVoter()) {
                voter.setNama(newName);
                voter.setUsername(newUsername);
                voter.setPassword(newPassword);
                voter.setUmur(newAge);
        }
    }


    public void pilihKandidat(int idKandidat, Voter voter) {
        Kandidat kandidat = getKandidatById(idKandidat);
        if (kandidat != null) {
            if (!voter.isVoting()) {
                Vote vote = new Vote(idKandidat, this);
                addVote(vote);
                System.out.println("Anda telah memilih " + kandidat.getNama() + " dengan partai " + kandidat.getPartai());  
                voter.setVoting(true);
            } else {
                System.out.println("Anda sudah melakukan voting!");
            }
        } else {
            System.out.println("Kandidat tidak ditemukan!");
        }
    }

    public VoterAcc loginVoter(String username, String password) {
        for (VoterAcc voterAcc : voter) {
            if (voterAcc.getUsername().equals(username) && voterAcc.getPassword().equals(password)) {
                return voterAcc;
            }
        }
        return null;
    }

    public void dataPemilih() {
        System.out.println("+----+----------------------+-------+-----------------+");
        System.out.println("| ID | Nama                 | Umur  | Status Memilih   |");
        System.out.println("+----+----------------------+-------+-----------------+");
        for (Voter voter2 : voter) {
            System.out.printf("| %-2d | %-20s | %-5d | %-15s |\n",
            voter2.getId(),
            voter2.getNama(),
            voter2.getUmur(),
            (voter2.isVoting() ? "sudah memilih" : "belum memilih"));
        }
        System.out.println("+----+----------------------+-------+-----------------+");
        System.out.println("Jumlah Pemilih: " + voter.size());
    }

    public void dataKandidat() {
        System.out.println("+----+----------------------+------------------+");
        System.out.println("| ID | Nama                 | Partai           |");
        System.out.println("+----+----------------------+------------------+");
        for (Kandidat kandidat : kandidat) {
            System.out.printf("| %-2d | %-20s | %-16s |\n",
                kandidat.getId(),
                kandidat.getNama(),
                kandidat.getPartai());
        }
        System.out.println("+----+----------------------+------------------+");
    }


    public void hasilVoting() {
        int totalVote = 0;
        Kandidat pemenang = null;
        int maxVote = 0;

        System.out.println("+----+------------------------------------+--------------------+--------------+");
        System.out.println("| ID | Nama Kandidat                     | Partai             | Jumlah Suara |");
        System.out.println("+----+------------------------------------+--------------------+--------------+");

        for (Kandidat kandidat : kandidat) {
            int kandidatTerpilih = 0;
            for (Vote vote : vote) {
                if (vote.getKandidat().equals(kandidat)) {
                    kandidatTerpilih++;
                }
            }

            totalVote += kandidatTerpilih;

            if (kandidatTerpilih > maxVote) {
                maxVote = kandidatTerpilih;
                pemenang = kandidat;
            }

            System.out.printf("| %-2d | %-34s | %-18s | %-12d |\n", kandidat.getId(), kandidat.getNama(), kandidat.getPartai(), kandidatTerpilih);
            System.out.println("+----+------------------------------------+--------------------+--------------+");   
        }

        System.out.println("Total Suara: " + totalVote);
        if (pemenang == null) {
            System.out.println("Suara masih kosong!");
        } else {
            System.out.println("Pemenang: " + pemenang.getNama() + " (" + pemenang.getPartai() + ") dengan " + maxVote + " suara");
        }

    }

}
