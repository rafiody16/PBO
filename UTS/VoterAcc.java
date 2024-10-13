public class VoterAcc extends Voter {
    private String username;
    private String password;

    public VoterAcc(int id, String nama, int umur, String username, String password) {
        super(id, nama, umur);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}