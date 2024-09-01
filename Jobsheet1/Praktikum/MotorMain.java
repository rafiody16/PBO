package Jobsheet1.Praktikum;

public class MotorMain {
    public static void main(String[] args) {
        Motor mt1 = new Motor();
        mt1.setMerek("Yamaha");
        mt1.setTipe("R25");
        mt1.tambahKecepatan(10);
        mt1.rem(5);
        mt1.setTransmisi(2);
        mt1.cetakStatus();
    }
}
