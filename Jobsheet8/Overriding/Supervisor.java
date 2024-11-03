package Overriding;

public class Supervisor extends Manajer {

    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    public void naikkanGaji() {
        gaji += 1500000;
    }
    
}
