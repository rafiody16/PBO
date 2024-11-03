package Overloading;
public class MainMobil {

    public static void main(String[] args) {
        
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gs = new GasStation();

        gs.isiBahanBakar(alphard, 20000);
        gs.isiBahanBakar(carry, 20000);

    }
    
}
