public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong() {}

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public Gerbong(String kode, int kapasitas) {
        this.kode = kode;
        this.arrayKursi = new Kursi[kapasitas];
        this.initKursi();
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return this.kode;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi nomor " + nomor + " sudah terisi.");
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }    
    
}
