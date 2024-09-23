package KoperasiGetterSetter;
import java.util.Scanner;

public class KoperasiDemo {

    public static void main(String[] args) {
        // Anggota anggota1 = new Anggota("Iwan", "Jalan Rawar");
        // System.out.println("Simpanan "+ anggota1.getNama() +" : Rp. "+ anggota1.getSimpanan());
        // anggota1.setNama("Iwan Setiawan");
        // anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        // anggota1.setor(100000);
        // System.out.println("Simpanan "+ anggota1.getNama() +" : Rp. "+ anggota1.getSimpanan());

        // anggota1.pinjam(5000);
        // System.out.println("Simpanan "+ anggota1.getNama() +" : Rp. "+ anggota1.getSimpanan());

        // Anggota donny = new Anggota("111333444", "Donny", 5000000);

        // System.out.println("Nama Anggota: "+ donny.getNama());
        // System.out.println("Limit Pinjaman: "+ donny.getLimit());

        // System.out.println("\nMeminjam uang Rp. 10.000.000... ");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: "+ donny.getPinjaman());

        // System.out.println("\nMeminjam uang Rp. 4.000.000... ");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: "+ donny.getPinjaman());

        // System.out.println("\nMembayar angsuran Rp. 1.000.000... ");
        // donny.angsur(200000);
        // System.out.println("Jumlah pinjaman saat ini: "+ donny.getPinjaman());

        // System.out.println("\nMembayar angsuran Rp. 3.000.000... ");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: "+ donny.getPinjaman());
        Scanner sc = new Scanner(System.in);

        System.out.print("NIK: ");
        String nik = sc.next();
        System.out.print("Nama: ");
        String nama = sc.next();
        System.out.print("Limit Pinjaman: ");
        int limit = sc.nextInt();
        System.out.println();
        Anggota agt = new Anggota(nik, nama, limit);

        int pilih;

        do {
            System.out.println("1. Pinjam\n2. Angsur\n3. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("Nominal Pinjam: ");
                    int pjm = sc.nextInt();
                    agt.pinjam(pjm);
                    System.out.println("Jumlah pinjaman saat ini: "+ agt.getPinjaman());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nominal Angsur: ");
                    int angs = sc.nextInt();
                    agt.angsur(angs);
                    System.out.println("Jumlah pinjaman saat ini: "+ agt.getPinjaman());
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }    
        } while (pilih != 3);

        sc.close();
    }
    
}
