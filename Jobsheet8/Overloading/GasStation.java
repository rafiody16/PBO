package Overloading;
public class GasStation {

    public void isiBahanBakar(MobilMewah mw, int bayar) {
        int hasil = bayar / 10000;
        System.out.println("Mobil Mewah diisi pertamax sebanyak " + hasil +" liter");
    }

    public void isiBahanBakar(MobilKuno mk, int bayar) {
        int hasil = bayar / 5000;
        System.out.println("Mobil Mewah diisi pertamax sebanyak " + hasil +" liter");
    }

}
