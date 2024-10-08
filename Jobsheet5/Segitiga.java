public class Segitiga {

    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }

    public float keliling() {
        return alas + tinggi + (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
    
}
