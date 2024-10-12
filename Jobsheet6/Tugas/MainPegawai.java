package Tugas;

public class MainPegawai {

    public static void main(String[] args) {
        
        DaftarGaji daftarGaji = new DaftarGaji(2);

        Pegawai dosen1 = new Dosen("N12", "Ilham", "Malang");
        ((Dosen) dosen1).setSKS(12);
        Pegawai dosen2 = new Dosen("N18", "Yusuf", "Malang");
        ((Dosen) dosen2).setSKS(10);

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();

    }
    
}
