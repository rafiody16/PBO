package MotorEncapsulation;

public class Motor {

    // Percobaan 1:
    // public int kecepatan = 0;
    // public boolean kontakOn = false;

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan >= 100) {
                System.out.println("Kecepatan sudah maksimal! \n");
            } else {
                kecepatan += 50;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karenam Mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan: "+ kecepatan +"\n");
    }
    
}
