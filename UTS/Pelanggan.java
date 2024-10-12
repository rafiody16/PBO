public class Pelanggan {

    private int idSIM;
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;
    private Mobil mobilYangDipinjam;

    public Pelanggan(int idSIM, String nama, String alamat, String noTelp, String email) {
        this.idSIM = idSIM;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.mobilYangDipinjam = null;
    }

    public int getIdSIM() {
        return idSIM;
    }

    public void setIdSIM(int idSIM) {
        this.idSIM = idSIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Mobil getMobilYangDipinjam() {
        return mobilYangDipinjam;
    }

    public void setMobilYangDipinjam(Mobil mobilYangDipinjam) {
        this.mobilYangDipinjam = mobilYangDipinjam;
    }

    public void displayInfo() {
        System.out.println("ID SIM : " + idSIM);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No. Telp : " + noTelp);
        System.out.println("Email : " + email);
        if (mobilYangDipinjam != null) {
            System.out.println("Mobil Yang Dipinjam : ");
            mobilYangDipinjam.displayInfo();
        }
    }
    
}
