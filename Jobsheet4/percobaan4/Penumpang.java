public class Penumpang {
    
    private String nama;
    private String ktp;

    public Penumpang() {}

    public Penumpang(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return this.ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

}
