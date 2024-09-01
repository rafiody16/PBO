package Jobsheet1.Praktikum;

public class Motor {

    private String merek, tipe;
    private int kecepatan, transmisi;

    public void setMerek(String newValue) {
        merek = newValue;
    }   

    public void setTipe(String newValue) {
        tipe = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void rem(int decrement) {
        kecepatan -= decrement;
    }   

    public void setTransmisi(int newValue) {    
        transmisi = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek: "+merek);
        System.out.println("Tipe: "+tipe);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Transmisi: "+transmisi);
    }
    
}
