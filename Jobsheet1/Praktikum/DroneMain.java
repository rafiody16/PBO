package Jobsheet1.Praktikum;

public class DroneMain {

    public static void main(String[] args) {
        Drone dr1 = new Drone();
        dr1.setMerek("DJI");
        dr1.setTipe("Mini");
        dr1.setBaterai(100);
        dr1.kurangBaterai(50);
        dr1.cetakStatus();
    }
    
}
