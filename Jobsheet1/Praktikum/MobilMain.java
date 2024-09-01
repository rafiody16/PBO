package Jobsheet1.Praktikum;

public class MobilMain {

    public static void main(String[] args) {
        
        Mobil mb1 = new Mobil();
        mb1.setMerek("Toyota");
        mb1.setWarna("Merah");
        mb1.tambahKecepatan(10);
        mb1.rem(5);
        mb1.setTransmisi(2);
        mb1.cetakStatus();
        
    }
    
}
