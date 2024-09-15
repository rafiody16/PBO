package Praktikum;

public class Main {

    public static void main(String[] args) {
        
        DVDGame d = new DVDGame();
        Peminjaman p = new Peminjaman();
       
        d.inputDVDGame("B001", "Fifa 24", "Sports", 10, 20000);
        d.tampilBarang();
        d.ubahStok("Fifa 24", 5);
        d.tampilBarang();
        d.ubahHarga("Fifa 24", 15000);
        d.tampilBarang();
        d.ubahData("B001", "GTA V", "Action", 7, 25000);
        d.tampilBarang();
    
        p.inputPeminjaman(1, "Ody", "JL Doho", "081234567890", d, d, "2024-09-20", "2024-09-29", 2);
        p.hitungLamaPinjam();
        p.totalHarga();
        p.tampilPeminjaman();

    }
    
}
