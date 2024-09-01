package Jobsheet1.Praktikum;

public class Handphone {

    private String merek, warna, os;
    private int sound;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setOs(String newValue) {    
        os = newValue;
    }

    public void upVolume(int increment) {    
        sound += increment;
    }

    public void downVolume(int decrement) {    
        sound -= decrement;
    }   

    public void cetakStatus() {
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("OS: "+os);
        System.out.println("Volume: "+sound);
    }
}