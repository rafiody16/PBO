public class Lingkaran {
    
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return 3.14f * r * r;
    }

    public float keliling() {
        return 2 * 3.14f * r;
    }

}
