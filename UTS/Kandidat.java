public class Kandidat extends Person{

    private String partai;

    public Kandidat(int id, String nama, String partai) {
        super(id, nama);
        this.partai = partai;
    }

    public String getPartai() {
        return partai;
    }

    public void setPartai(String partai) {
        this.partai = partai;
    }
    
}
