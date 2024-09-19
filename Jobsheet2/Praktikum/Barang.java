package Praktikum;

public class Barang {

    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public void inputBarang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHarga() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    public void tampilData(){
        System.out.println();
        System.out.println("=========================================================");    
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga Akhir : Rp. " + hitungHarga());
        System.out.println("=========================================================");
        System.out.println();
    }
    
}

class MainBarang{

    public static void main(String[] args) {
        
        Barang b = new Barang();
        b.inputBarang("B001", "Buku Tulis", 20000, 50.0f);
        b.tampilData();

    }

}
