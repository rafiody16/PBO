public class Mobil {

    private int idMobil;
    private String merk;
    private int tahun;
    private int hargaSewa;
    private boolean status;

    public Mobil(int idMobil, String merk, int tahun, int hargaSewa, boolean status) {
        this.idMobil = idMobil;
        this.merk = merk;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public int getHargaSewa() {
        return hargaSewa; 
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void displayInfo(){
        System.out.println("ID : " + idMobil);
        System.out.println("Merk : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("Status : " + status);
    }



}