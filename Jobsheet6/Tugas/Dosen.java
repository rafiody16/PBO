package Tugas;

public class Dosen extends Pegawai {

    private int jumlahSKS;
    private int tarifSKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * tarifSKS;
    }

}
