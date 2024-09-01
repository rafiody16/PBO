package Jobsheet1.Praktikum;

public class Drone {

    private String merek, tipe;
    private int baterai, lama_terbang;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setTipe(String newValue) {
        tipe = newValue;
    }

    public void setBaterai(int newValue) {
        baterai = newValue;
    }

    public void kurangBaterai(int decrement) {
        baterai -= decrement;   
    }

    public int lamaTerbang() {
        int setBt = baterai; 
        if (setBt >= 80) {
            System.out.print("Lama Terbang: 30 Menit");
        } else if (setBt <= 60) {
            System.out.print("Lama Terbang: 20 Menit");
        } else if (setBt <= 30 ) {
            System.out.print("Lama Terbang: 10 Menit");
        } else if (setBt <= 10) {
            System.out.print("Baterai Lemah");
        } else {
            System.out.println("Drone Mati");
        }
        return lama_terbang;
    }

    public void cetakStatus() {
        System.out.println("Merek: "+merek);
        System.out.println("Tipe: "+tipe);
        System.out.println("Baterai: "+baterai);
        lamaTerbang();
    }
    
}
