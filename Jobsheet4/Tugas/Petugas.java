public class Petugas {

    private String nama;
    private String nip;

    public Petugas() {}

    public Petugas(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void info() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIP: " + this.nip);
    }
    
}
