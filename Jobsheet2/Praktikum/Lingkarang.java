package Praktikum;

public class Lingkarang {

    double phi;
    double r;
    
    public void getLingkaran(double r) {
        this.phi = 3.14;
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

}

class Main {

    public static void main(String[] args) {
        
        Lingkarang l = new Lingkarang();

        l.getLingkaran(45);
        System.out.println("Luas Lingkaran : " + l.hitungLuas());
        System.out.println("Keliling Lingkaran : " + l.hitungKeliling());

    }

}
