public class Voter extends Person{

    private int umur;
    private VoterAcc account;
    private boolean isVoting;

    public Voter(int id, String nama, int umur, VoterAcc account) {
        super(id, nama);
        this.umur = umur;  
        this.account = account;
        this.isVoting = false;
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

    public void addAccount(VoterAcc account) {
        this.account = account;
    }

    public boolean isVoting() {
        return isVoting;
    }

    public void setVoting(boolean voting) {
        isVoting = voting;
    }
    
}
