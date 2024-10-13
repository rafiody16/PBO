import java.util.List;
import java.util.Scanner;

public class MainVoting {

    public static void main(String[] args) {

        Admin admin = new Admin("admin", "admin123");
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);
        int pilih;

        VoterAcc voter69 = new VoterAcc(1, "dave", 21, "dave", "dave123");
        votingSystem.addVoter(voter69);

        Kandidat kandidat99 = new Kandidat(1, "Prabowo", "Gerindra");
        admin.addKandidat(votingSystem, kandidat99);
        Kandidat kandidat91 = new Kandidat(2, "Jokowi", "PDIP");
        admin.addKandidat(votingSystem, kandidat91);

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Selamat Datang di Aplikasi Sistem Voting");
            System.out.print("Username: ");
            String username = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();
            VoterAcc voterLogin = votingSystem.loginVoter(username, password);

            if (username.equals("admin") && password.equals("password")) {
                loggedIn = true;
                while (loggedIn) {
                    System.out.println("\nAdmin Menu:");
                    System.out.println("1. Tambah Pemilih\n2. Daftar Pemilih\n3. Tambah Kandidat\n4. Daftar Kandidat\n5. Update Voter\n6. Update Kandidat\n7. Delete Voter\n8. Delete Kandidat\n9. Hasil Voting\n10. Logout\n0. Exit");

                    System.out.print("Enter your pilih: ");
                    pilih = scanner.nextInt();

                    switch (pilih) {
                        case 1:
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

                            VoterAcc acc = new VoterAcc(voterId, voterName, voterAge, voterUsername, voterPassword);
                            admin.addVoter(votingSystem, acc);
                            break;

                        case 2:
                            votingSystem.dataPemilih();
                            break;

                        case 3:
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
                            List<Kandidat> kandidatList = votingSystem.getKandidat();
                            System.out.println("Daftar Kandidat:");
                            for (Kandidat kandidat2 : kandidatList) {
                                System.out.println(kandidat2.getId() + ". " + kandidat2.getNama() + " (" + kandidat2.getPartai() + ")");
                            }
                            break;

                        case 5:
                            System.out.print("Masukkan id voter untuk update: ");
                            int updateVoterId = scanner.nextInt();
                            System.out.print("Masukkan nama baru: ");
                            String newVoterName = scanner.next();
                            System.out.print("Masukkan umur baru: ");
                            int newVoterAge = scanner.nextInt();

                            admin.updateVoter(votingSystem, updateVoterId, newVoterName, newVoterAge);
                            break;

                        case 6:
                            System.out.print("Enter kandidat ID to update: ");
                            int updateKandidatId = scanner.nextInt();
                            System.out.print("Enter new kandidat name: ");
                            String newKandidatName = scanner.next();
                            System.out.print("Enter new kandidat party: ");
                            String newKandidatParty = scanner.next();

                            admin.updateKandidat(votingSystem, updateKandidatId, newKandidatName, newKandidatParty);
                            break;

                        case 7:
                            System.out.print("Enter voter ID to delete: ");
                            int deleteVoterId = scanner.nextInt();
                            admin.deleteVoter(votingSystem, deleteVoterId);
                            break;

                        case 8:
                            System.out.print("Enter kandidat ID to delete: ");
                            int deleteKandidatId = scanner.nextInt();
                            admin.deleteKandidat(votingSystem, deleteKandidatId);
                            break;
                        case 9:
                            votingSystem.hasilVoting();
                            break;
                        case 10:
                            loggedIn = false; 
                            System.out.println("Admin logged out.");
                            break;
                        case 0:
                            System.exit(0);
                            break;

                        default:
                    }
                }
            } else if (voterLogin != null) {
                loggedIn = true;
                while (true) {
                    System.out.println("\nAplikasi Sistem Voting");
                    System.out.println("Selamat Datang "+ voterLogin.getNama());
                    System.out.println("1. Pilih Kandidat\n2. Hasil Voting\n3. Logout\n4. Exit");
                    System.out.print("Pilih: ");
                    pilih = scanner.nextInt();
                    
                    switch (pilih) {
                        case 1:
                            List<Kandidat> kandidatList = votingSystem.getKandidat();
                            System.out.println("Daftar Kandidat:");
                            for (Kandidat kandidat2 : kandidatList) {
                                System.out.println(kandidat2.getId() + ". " + kandidat2.getNama() + " (" + kandidat2.getPartai() + ")");
                            }
                            System.out.print("Masukkan ID kandidat: ");
                            int candidateId = scanner.nextInt();
                            votingSystem.pilihKandidat(candidateId, voterLogin);
                            break;

                        case 2:
                            votingSystem.hasilVoting();
                            break;
                        
                        case 3:
                            System.out.println("Data Akun saat ini:");
                            System.out.println("ID: " + voterLogin.getId() + "\nNama: "+ voterLogin.getNama() + "\nUsername: " + voterLogin.getUsername() + "\nPassword: " + voterLogin.getPassword() + "\nUmur: " + voterLogin.getUmur());
                            System.out.println("Apakah anda yakin ingin mengganti data akun? (y/n)");
                            System.out.print("Pilih: ");
                            String confirm = scanner.next();
                            if (confirm.equalsIgnoreCase("y")) {
                                System.out.print("Masukkan nama: ");
                                String voterName = scanner.next();
                                System.out.print("Masukkan username: ");
                                String voterUsername = scanner.next();
                                System.out.print("Masukkan password: ");
                                String voterPassword = scanner.next();
                                System.out.print("Masukkan umur: ");
                                int voterAge = scanner.nextInt();
                                votingSystem.updateVoter(voterLogin.getId(), voterName, voterUsername, voterPassword, voterAge);   
                                break;
                            } else {
                                System.out.println("Kembali ke menu ...");
                                break;
                            }

                        case 4:
                            loggedIn = false;
                            break;

                        case 5:
                            System.exit(0);
                            break;

                        default:
                            
                    }

                    if (!loggedIn) break;
                }
            } else {
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }
        scanner.close();
    }
}