import java.util.Scanner;

public class MainVoting {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Create Kandidats
        Kandidat Kandidat1 = new Kandidat(1, "John Doe", "Party A");
        Kandidat Kandidat2 = new Kandidat(2, "Jane Doe", "Party B");

        // Add Kandidats to the voting system
        votingSystem.addKandidat(Kandidat1);
        votingSystem.addKandidat(Kandidat2);

        // Cast votes
        votingSystem.addVote(new Vote(Kandidat1));
        votingSystem.addVote(new Vote(Kandidat1));
        votingSystem.addVote(new Vote(Kandidat2));

        // Display the vote results
        votingSystem.hasilVoting();
    
    }
}