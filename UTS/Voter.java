public class Voter extends Person{

    private int umur;
    private VoterAcc account;

    public Voter(int id, String nama, int umur, VoterAcc account) {
        super(id, nama);
        if (umur >= 17) {
            this.umur = umur;   
        }
        this.account = account;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public VoterAcc getAccount() {
        return account;
    }

    public void setAccount(VoterAcc account) {
        this.account = account;
    }
    
}
