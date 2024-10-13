import java.util.*;

public class VotingSystem {

    private List<Voter> voter;
    private List<Kandidat> kandidat;
    private List<Vote> vote;

    public VotingSystem() {
        voter = new ArrayList<>();
        kandidat = new ArrayList<>();
        vote = new ArrayList<>();
    }

    public void addVoter(Voter voter) {
        this.voter.add(voter);
    }

    public void addKandidat(Kandidat kandidat) {
        this.kandidat.add(kandidat);
    }

    public void addVote(Vote vote) {
        this.vote.add(vote);
    }

    public List<Voter> getVoter() {
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

    public Voter loginVoter(String username, String password) {
        for (Voter voter : voter) {
            if (voter.getAccount().getUsername().equals(username) && voter.getAccount().getPassword().equals(password)) {
                return voter;
            }
        }
        return null;
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
