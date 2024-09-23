package KoperasiGetterSetter;

public class Anggota {

    private String nama;
    // private String nik;
    private String nik;
    private int limit;
    private float pinjaman;
    private float simpanan;

    public Anggota(){}

    Anggota(String nik, String nama, int limit) {
        this.nama = nama;
        this.nik = nik;
        this.limit = limit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setnik(String nik) {
        this.nik = nik;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getLimit() {
        return limit;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        if (uang > limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            pinjaman += uang;
        }
    }

    public void angsur(float uang) {
        float batasAngsur = 0.1f * pinjaman;
        if (uang < batasAngsur) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            pinjaman -= uang;
        }
    }

    public float getPinjaman() {
        return pinjaman;
    }
    
}
