package Jobsheet1.Praktikum;

public class KulkasMain {

    public static void main(String[] args) {
        
        Kulkas ks1 = new Kulkas();
        ks1.setMerek("LG");
        ks1.setWarna("Putih");
        ks1.upSuhu(3);
        ks1.downSuhu(2);
        ks1.cetakStatus();
        
    }
    
}
