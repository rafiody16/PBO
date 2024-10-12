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

    public void pilihKandidat(int idKandidat) {
        Kandidat kandidat = getKandidatById(idKandidat);
        if (kandidat != null) {
            Vote vote = new Vote(idKandidat, this);
            addVote(vote);
            System.out.println("Kandidat dipilih");
        } else {
            System.out.println("Kandidat tidak ditemukan");
        }
    }

    public boolean loginVoter(String username, String password) {
        for (Voter voter : voter) {
            if (voter.getAccount().getUsername().equals(username) && voter.getAccount().getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void hasilVoting() {
        int totalVotes = 0;
        Kandidat winner = null;
        int maxVotes = 0;

        for (Kandidat kandidat : kandidat) {
            int candidateVotes = 0;
            for (Vote vote : vote) {
                if (vote.getCandidate().equals(kandidat)) {
                    candidateVotes++;
                }
            }

            totalVotes += candidateVotes;

            if (candidateVotes > maxVotes) {
                maxVotes = candidateVotes;
                winner = kandidat;
            }

            System.out.println(kandidat.getNama() + " (" + kandidat.getPartai() + "): " + candidateVotes + " suara");    
        }

        System.out.println("Total Suara: " + totalVotes);
        System.out.println("Pemenang: " + winner.getNama() + " (" + winner.getPartai() + ") dengan " + maxVotes + " suara");

    }

}