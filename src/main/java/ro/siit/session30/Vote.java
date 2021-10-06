package ro.siit.session30;

public class Vote {
    private Candidate electedCandidate;

    public Vote(Candidate candidate){
        this.electedCandidate = candidate;
    }

    public Candidate getElectedCandidate() {
        return electedCandidate;
    }
}
