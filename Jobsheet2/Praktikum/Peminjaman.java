package Praktikum;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Peminjaman extends DVDGame {
    
    int id_Peminjaman;
    String nama_Peminjaman;
    String alamat_Peminjaman;
    String telp_Peminjaman;
    DVDGame dvdGame;
    String nama_Dvd;
    LocalDate tglPinjam;
    LocalDate tglKembali;
    int harga;
    int qty;

    public Peminjaman() {

    }

    public void inputPeminjaman(int id_peminjaman, String nama_peminjam, String alamat_peminjam, String telp_peminjam, DVDGame nama_dvd, DVDGame dvdGame, String tglPinjam, String tglKembali, int qty) {
            this.id_Peminjaman = id_peminjaman;
            this.nama_Peminjaman = nama_peminjam;
            this.alamat_Peminjaman = alamat_peminjam;
            this.telp_Peminjaman = telp_peminjam;
            this.nama_Dvd = dvdGame.nama_DVDGame;
            this.dvdGame = dvdGame;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            this.tglPinjam = LocalDate.parse(tglPinjam, formatter);
            this.tglKembali = LocalDate.parse(tglKembali, formatter);
            this.qty = qty;
            this.harga = dvdGame.harga_DVDGame;
    }

    public int hitungLamaPinjam() {
        Duration diff = Duration.between(tglPinjam.atStartOfDay(), tglKembali.atStartOfDay());
        return (int) diff.toDays();
    }

    public void tampilPeminjaman() {
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("CETAK PEMINJAMAN ");
        System.out.println("ID Peminjaman : " + id_Peminjaman);
        System.out.println("Nama Peminjam : " + nama_Peminjaman);
        System.out.println("Alamat Peminjam : " + alamat_Peminjaman);
        System.out.println("No. Telp Peminjam : " + telp_Peminjaman);
        System.out.println("DVD Game : " + nama_Dvd);
        System.out.println("Tgl. Pinjam : " + tglPinjam);
        System.out.println("Tgl. Kembali : " + tglKembali);
        System.out.println("Lama Pinjam: "+ hitungLamaPinjam() + " hari");
        System.out.println("Qty : " + qty);
        System.out.println("Total Harga : " + totalHarga());
        System.out.println("=========================================================");
        System.out.println();
    }

    public int totalHarga() {
        int lama_pinjam = hitungLamaPinjam();
        int hitungTotal = (harga * qty) * lama_pinjam;
        return hitungTotal;
    }
    
}
