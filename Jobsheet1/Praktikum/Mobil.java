package Jobsheet1.Praktikum;

public class Mobil {

    private String merek, warna;
    private int kecepatan, transmisi;

    public void setMerek(String newValue) {
        merek = newValue;
    }   

    public void setWarna(String newValue) {
        warna = newValue;
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
        System.out.println("Warna: "+warna);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Transmisi: "+transmisi);
    }
    
}
