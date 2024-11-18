package Tugas.Overriding;

public class MainManusia {

    public static void main(String[] args) {
        
        Manusia mns = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        mns.bernafas();
        dsn.lembur();
        mhs.tidur();

        mns.makan();
        dsn.makan();
        mhs.makan();

    }
    
}
