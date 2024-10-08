import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Peminjaman {

    private Buku buku;
    private Anggota anggota;
    private Petugas petugas;
    private LocalDate tglPinjam;
    private LocalDate tglKembali;
    private int denda;

    public Peminjaman() {}

    public Peminjaman(Buku buku, Anggota anggota, Petugas petugas, String tglPinjam, String tglKembali, int denda) {
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.tglPinjam = LocalDate.parse(tglPinjam, formatter);
        this.tglKembali = LocalDate.parse(tglKembali, formatter);
        this.denda = denda;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public LocalDate getTglPinjam() {
        return tglPinjam;
    }

    public LocalDate getTglKembali() {
        return tglKembali;
    }

    public int getDenda() {
        return denda;
    }

    public void setTglPinjam(String tglPinjam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.tglPinjam = LocalDate.parse(tglPinjam, formatter);
    }

    public void setTglKembali(String tglKembali) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.tglKembali = LocalDate.parse(tglKembali, formatter);
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int hitungLamaPinjam() {
        Duration diff = Duration.between(tglPinjam.atStartOfDay(), tglKembali.atStartOfDay());
        return (int) diff.toDays();
    }

    public int bukuKembali(String bukuKembali) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tglPengembalian = LocalDate.parse(bukuKembali, formatter);

        if (tglPengembalian.isAfter(tglKembali)) {
            int keterlambatan = hitungLamaPinjam();
            return (int) (denda * keterlambatan);
        } else {
            return 0;
        }
    }

    public void cetak() {
        System.out.println("Buku : " + buku.getJudul());
        System.out.println("Anggota : " + anggota.getNama());
        System.out.println("Petugas : " + petugas.getNama());
        System.out.println("Tgl Pinjam : " + tglPinjam);
        System.out.println("Tgl Kembali : " + tglKembali);
        System.out.println("Lama Pinjam : " + hitungLamaPinjam() + " hari");
        System.out.println("Denda : " + bukuKembali(tglKembali.toString()));
    }
}
