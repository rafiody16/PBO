import java.util.List;
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

        List<Kandidat> kandidatList = votingSystem.getKandidat();
        for (Kandidat kandidat : kandidatList) {
            System.out.println(kandidat.getId() + ". "+ kandidat.getNama() + " (" + kandidat.getPartai() + ")");
        }

        // Cast votes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the candidate you want to vote for: ");
        int candidateId = sc.nextInt();
        votingSystem.pilihKandidat(candidateId);

        // Display the vote results
        votingSystem.hasilVoting();
    
        sc.close();
    }
}