public class MainBangunDatar {

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(20, 5);
        Segitiga s = new Segitiga(13, 8);
        Lingkaran l = new Lingkaran(20);
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Luas Segitiga: " + s.luas());
        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("=========================================");
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());
        System.out.println("Keliling Segitiga: " + s.keliling());
        System.out.println("Keliling Lingkaran: " + l.keliling());
    }
}