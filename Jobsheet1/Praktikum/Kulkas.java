package Jobsheet1.Praktikum;

public class Kulkas {

    private String merek, warna;
    private int suhu;

    public void setMerek(String newValue) {
        merek = newValue;
    }   

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void upSuhu(int increment) {
        suhu += increment;
    }   

    public void downSuhu(int decrement) {    
        suhu -= decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("Suhu: "+suhu);
    }
    
}
