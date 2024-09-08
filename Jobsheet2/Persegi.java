public class Persegi {

    private int sisi;

    public void getSisi(int s) {
        sisi = s;
    }

    public int getLuas() {
        return sisi * sisi;
    }

    public int getKeliling() {
        return 4 * sisi;
    }

    public void cetak() {
        System.out.println("sisi = " + sisi);
        System.out.println("Luas = " + getLuas());
        System.out.println("Keliling = " + getKeliling());
    }
    
}

class TampilPersegi{

    public static void main(String[] args) {
        
        Persegi p = new Persegi();
        p.getSisi(5);
        p.cetak();
        
    }

}