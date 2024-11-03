package Overriding;

public class SalesManajer extends Manajer {

    protected String departemen;
    
    public SalesManajer(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void naikkanGaji() {
        gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }


}
