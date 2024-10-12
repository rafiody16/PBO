package Tugas;

public class DaftarGaji {

    private Pegawai[] listPegawai;

    public DaftarGaji(int jumlahPegawai) {
        this.listPegawai = new Pegawai[jumlahPegawai];
    }
    
    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println("Nama: " + pegawai.getNama() + " | Gaji: " + pegawai.getGaji());
            }
        }
    }

}
