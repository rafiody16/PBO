public class MainTugas {

    public static void main(String[] args) {
        Anggota anggota = new Anggota();
        anggota.setNama("Nafis");
        anggota.setAlamat("Malang");
        anggota.setTelepon("081234567890");
        anggota.info();

        Buku buku = new Buku("Koala Kumal", "Radit", 2022);

        Petugas petugas = new Petugas("Aryanto", "21212");

        Peminjaman peminjaman = new Peminjaman(buku, anggota, petugas, "2024-01-10", "2024-01-11", 5000);
        peminjaman.cetak();

        peminjaman.setTglKembali("2024-01-11");
        peminjaman.cetak();
    }
    
}
