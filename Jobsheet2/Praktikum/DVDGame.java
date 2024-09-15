package Praktikum;

public class DVDGame {

    String id_DVDGame;
    String nama_DVDGame;
    String genre_DVDGame;
    int stok_DVDGame;
    int harga_DVDGame;

    public DVDGame() {

    }

    public void inputDVDGame(String id_DVDGame, String nama_DVDGame, String genre_DVDGame, int stok_DVDGame, int harga_DVDGame) {
        this.id_DVDGame = id_DVDGame;
        this.nama_DVDGame = nama_DVDGame;
        this.genre_DVDGame = genre_DVDGame;
        this.stok_DVDGame = stok_DVDGame;
        this.harga_DVDGame = harga_DVDGame;
    }

    public void tampilBarang() {
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("ID DVD Game   : " + id_DVDGame);
        System.out.println("Nama DVD Game : " + nama_DVDGame);
        System.out.println("Genre DVD Game: " + genre_DVDGame);
        System.out.println("Stok DVD Game : " + stok_DVDGame);
        System.out.println("Harga per hari: " + harga_DVDGame);
        System.out.println("=========================================================");
        System.out.println();
    }

    public void ubahStok(String nama, int stokBaru ) {
        if (nama.equalsIgnoreCase(nama_DVDGame)) {
            if (stokBaru >= 0) {
                this.harga_DVDGame = stokBaru;
                System.out.println("Stok DVD "+ nama +" berhasil diubah menjadi: "+ stokBaru);
            } else {
                System.out.println("Inputan tidak valid!");
            }
        } else {
            System.out.println("DVD "+ nama +" tidak ditemukan!");
        }
    }

    public void ubahHarga(String nama, int hargaBaru ) {
        if (nama.equalsIgnoreCase(nama_DVDGame)) {
            if (hargaBaru >= 0) {
                this.harga_DVDGame = hargaBaru;
                System.out.println("Harga DVD "+ nama +" berhasil diubah menjadi: "+ hargaBaru);
            } else {
                System.out.println("Inputan tidak valid!");
            }
        } else {
            System.out.println("DVD "+ nama +" tidak ditemukan!");
        }
    }

    public void ubahData(String id_DVDGame, String nama_DVDGame, String genre_DVDGame, int stok_DVDGame, int harga_DVDGame) {
        if (id_DVDGame.equalsIgnoreCase(this.id_DVDGame)) {
            this.nama_DVDGame = nama_DVDGame;
            this.genre_DVDGame = genre_DVDGame;
            this.stok_DVDGame = stok_DVDGame;
            this.harga_DVDGame = harga_DVDGame;
            System.out.println("Data DVD berhasil diubah");
        } else {
            System.out.println("Id DVD tidak ditemukan!");
        }
    }

}