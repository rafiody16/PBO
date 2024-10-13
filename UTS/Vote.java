public class Vote {
    private Kandidat kandidat;

    public Vote(int kandidat, VotingSystem votingSystem) {
        this.kandidat = votingSystem.getKandidatById(kandidat);
        if (this.kandidat == null) {
            System.out.println("Kandidat yang anda pilih tidak ada");
        }
    }


    public Kandidat getKandidat() {
        return kandidat;
    }
}