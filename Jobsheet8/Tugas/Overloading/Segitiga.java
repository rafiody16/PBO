package Tugas.Overloading;

public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC; 
    }
    
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
        return sisiA + sisiB + c;
    }

    public void tampil() {
        System.out.println("Total sudut 1: " + totalSudut(20));
        System.out.println("Total sudut 2: " + totalSudut(15, 10));
        System.out.println("Keliling 1: " + keliling(5, 10, 15));
        System.out.println("Keliling 2: " + keliling(10, 15));
    }

}
