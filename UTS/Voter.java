public class Voter extends Person{

    private int umur;
    private boolean isVoting;

    public Voter(int id, String nama, int umur) {
        super(id, nama);
        this.umur = umur;  
        this.isVoting = false;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public boolean isVoting() {
        return isVoting;
    }

    public void setVoting(boolean voting) {
        isVoting = voting;
    }
    
}
