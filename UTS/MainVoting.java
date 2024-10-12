import java.util.List;
import java.util.Scanner;

public class MainVoting {

    public static void main(String[] args) {

        Admin admin = new Admin("admin", "password");
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Seed: Menambahkan akun voter contoh
        VoterAcc ac = new VoterAcc("dave", "dave123");
        Voter voter69 = new Voter(1, "Dave", 21, ac);
        votingSystem.addVoter(voter69);

        // Loop untuk login
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Welcome to Voting System");
            System.out.print("Username: ");
            String username = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();

            // Cek apakah login sebagai admin
            if (username.equals("admin") && password.equals("password")) {
                loggedIn = true;  // Admin berhasil login
                while (true) {
                    System.out.println("\nAdmin Menu:");
                    System.out.println("1. Tambah Pemilih ");
                    System.out.println("2. Daftar Pemilih ");
                    System.out.println("3. Tambah Kandidat");
                    System.out.println("4. Daftar Kandidat");
                    System.out.println("5. Update Voter");
                    System.out.println("6. Update Kandidat");
                    System.out.println("7. Delete Voter");
                    System.out.println("8. Delete Kandidat");
                    System.out.println("9. Logout");
                    System.out.println("0. Exit");

                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            // Tambah pemilih
                            System.out.print("Masukkan ID: ");
                            int voterId = scanner.nextInt();
                            System.out.print("Masukkan nama: ");
                            String voterName = scanner.next();
                            System.out.print("Masukkan username: ");
                            String voterUsername = scanner.next();
                            System.out.print("Masukkan password: ");
                            String voterPassword = scanner.next();
                            System.out.print("Masukkan umur: ");
                            int voterAge = scanner.nextInt();

                            VoterAcc acc = new VoterAcc(voterUsername, voterPassword);
                            Voter voter = new Voter(voterId, voterName, voterAge, acc);
                            admin.addVoter(votingSystem, voter);
                            break;

                        case 2:
                            // Daftar pemilih
                            List<Voter> voterList = votingSystem.getVoter();
                            System.out.println("Daftar Pemilih:");
                            for (Voter voter2 : voterList) {
                                System.out.println(voter2.getId() + ". " + voter2.getNama() + " (" + voter2.getUmur() + ")");
                            }
                            break;

                        case 3:
                            // Tambah kandidat
                            System.out.print("Masukkan ID: ");
                            int kandidatId = scanner.nextInt();
                            System.out.print("Masukkan nama: ");
                            String kandidatName = scanner.next();
                            System.out.print("Masukkan partai: ");
                            String kandidatParty = scanner.next();

                            Kandidat kandidat = new Kandidat(kandidatId, kandidatName, kandidatParty);
                            admin.addKandidat(votingSystem, kandidat);
                            break;

                        case 4:
                            // Daftar kandidat
                            List<Kandidat> kandidatList = votingSystem.getKandidat();
                            System.out.println("Daftar Kandidat:");
                            for (Kandidat kandidat2 : kandidatList) {
                                System.out.println(kandidat2.getId() + ". " + kandidat2.getNama() + " (" + kandidat2.getPartai() + ")");
                            }
                            break;

                        case 5:
                            // Update voter
                            System.out.print("Masukkan id voter untuk update: ");
                            int updateVoterId = scanner.nextInt();
                            System.out.print("Masukkan nama baru: ");
                            String newVoterName = scanner.next();
                            System.out.print("Masukkan umur baru: ");
                            int newVoterAge = scanner.nextInt();

                            admin.updateVoter(votingSystem, updateVoterId, newVoterName, newVoterAge);
                            break;

                        case 6:
                            // Update kandidat
                            System.out.print("Enter kandidat ID to update: ");
                            int updateKandidatId = scanner.nextInt();
                            System.out.print("Enter new kandidat name: ");
                            String newKandidatName = scanner.next();
                            System.out.print("Enter new kandidat party: ");
                            String newKandidatParty = scanner.next();

                            admin.updateKandidat(votingSystem, updateKandidatId, newKandidatName, newKandidatParty);
                            break;

                        case 7:
                            // Delete voter
                            System.out.print("Enter voter ID to delete: ");
                            int deleteVoterId = scanner.nextInt();
                            admin.deleteVoter(votingSystem, deleteVoterId);
                            break;

                        case 8:
                            // Delete kandidat
                            System.out.print("Enter kandidat ID to delete: ");
                            int deleteKandidatId = scanner.nextInt();
                            admin.deleteKandidat(votingSystem, deleteKandidatId);
                            break;
                        case 9:
                            loggedIn = false; 
                            System.out.println("Admin logged out.");
                            return;
                        case 0:
                            System.out.println("Exiting...");
                            return;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else if (votingSystem.loginVoter(username, password)) {
                // Jika login sebagai voter
                loggedIn = true;
                while (true) {
                    System.out.println("\nVoting System");
                    System.out.println("1. Pilih Kandidat\n2. Hasil Voting\n3. Logout");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    
                    switch (choice) {
                        case 1:
                            // Pilih kandidat
                            List<Kandidat> kandidatList = votingSystem.getKandidat();
                            System.out.println("Daftar Kandidat:");
                            for (Kandidat kandidat2 : kandidatList) {
                                System.out.println(kandidat2.getId() + ". " + kandidat2.getNama() + " (" + kandidat2.getPartai() + ")");
                            }
                            System.out.print("Masukkan ID kandidat: ");
                            int candidateId = scanner.nextInt();
                            votingSystem.pilihKandidat(candidateId);
                            break;

                        case 2:
                            // Lihat hasil voting
                            votingSystem.hasilVoting();
                            break;

                        case 3:
                            // Logout
                            loggedIn = false;
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }

                    if (!loggedIn) break;  // Break if user logs out
                }
            } else {
                // Jika login gagal
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }
        // Add Kandidats to the voting system
        // votingSystem.addKandidat(Kandidat1);
        // votingSystem.addKandidat(Kandidat2);

        // List<Kandidat> kandidatList = votingSystem.getKandidat();
        // for (Kandidat kandidat : kandidatList) {
        //     System.out.println(kandidat.getId() + ". "+ kandidat.getNama() + " (" + kandidat.getPartai() + ")");
        // }

        // // Cast votes
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the ID of the candidate you want to vote for: ");
        // int candidateId = sc.nextInt();
        // votingSystem.pilihKandidat(candidateId);

        // // Display the vote results
        // votingSystem.hasilVoting();
    
        // sc.close();
    }
}