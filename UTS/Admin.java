import java.util.*;

public class Admin {

    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addVoter(VotingSystem votingSystem, VoterAcc voter) {
        votingSystem.addVoter(voter);
    }

    public void addKandidat(VotingSystem votingSystem, Kandidat kandidat) {
        votingSystem.addKandidat(kandidat);
    }

    public void updateVoter(VotingSystem votingSystem, int voterId, String newName, int newAge) {
        for (Voter voter : votingSystem.getVoter()) {
            if (voter.getId() == voterId) {
                voter.setNama(newName);
                voter.setUmur(newAge);
                break;
            }
        }
    }

    public void updateKandidat(VotingSystem votingSystem, int idKandidat, String newName, String newPartai) {
        for (Kandidat kandidat : votingSystem.getKandidat()) {
            if (kandidat.getId() == idKandidat) {
                kandidat.setNama(newName);
                kandidat.setPartai(newPartai);
            }
        }
    }


    public void deleteVoter(VotingSystem votingSystem, int voterId) {
        List<VoterAcc> voterList = votingSystem.getVoter();
        voterList.removeIf(voter -> voter.getId() == voterId);
    }

    public void deleteKandidat(VotingSystem votingSystem, int kandidatId) {
        List<Kandidat> kandidatList = votingSystem.getKandidat();
        kandidatList.removeIf(voter -> voter.getId() == kandidatId);
    }
    
}
