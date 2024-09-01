package Jobsheet1.Praktikum;

public class HandphoneMain {

    public static void main(String[] args) {

        Handphone hp1 = new Handphone();

        hp1.setMerek("Samsung");   
        hp1.setWarna("Hitam");
        hp1.setOs("Android");
        hp1.upVolume(5);
        hp1.downVolume(3);
        hp1.upVolume(2);
        hp1.cetakStatus();
    }
    
}
