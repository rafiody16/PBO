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
            } else {
                System.out.println("Data tidak ditemukan!");
            }
        }
    }

    public void updateKandidat(VotingSystem votingSystem, int idKandidat, String newName, String newPartai) {
        for (Kandidat kandidat : votingSystem.getKandidat()) {
            if (kandidat.getId() == idKandidat) {
                kandidat.setNama(newName);
                kandidat.setPartai(newPartai);
            } else {
                System.out.println("Data tidak ditemukan!");
            }
        }
    }


    public void deleteVoter(VotingSystem votingSystem, int voterId) {
        List<VoterAcc> voterList = votingSystem.getVoter();

        boolean vtr = voterList.stream().anyMatch(v -> v.getId() == voterId);

        if (vtr) {
            voterList.removeIf(voter -> voter.getId() == voterId);
            System.out.println("Pemilih berhasil dihapus!");
        } else {
            System.out.println("Pemilih tidak ditemukan!");
        }

    }

    public void deleteKandidat(VotingSystem votingSystem, int kandidatId) {
        List<Kandidat> kandidatList = votingSystem.getKandidat();

        boolean kandidat = kandidatList.stream().anyMatch(k -> k.getId() == kandidatId);

        if (kandidat) {
            kandidatList.removeIf(voter -> voter.getId() == kandidatId);
            System.out.println("Kandidat berhasil dihapus!");
        } else {
            System.out.println("Kandidat tidak ditemukan!");
        }

    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
}
