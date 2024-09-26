public class Sopir {

    private String nama;
    private int biaya;

    public Sopir() {}

    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() { 
        return biaya; 
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
    
}
