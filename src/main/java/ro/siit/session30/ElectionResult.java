package ro.siit.session30;

public class ElectionResult implements Comparable<ElectionResult>{
    private Candidate candidate;
    private Integer noOfVotes;

    public ElectionResult(Candidate candidate, Integer noOfVotes) {
        this.candidate = candidate;
        this.noOfVotes = noOfVotes;
    }

    @Override
    public int compareTo(ElectionResult o) {
        if(this.noOfVotes == o.noOfVotes){
            return this.candidate.compareTo(o.candidate);
        }
        return - this.noOfVotes.compareTo(o.noOfVotes);
    }

    @Override
    public String toString() {
        return candidate + ":" + noOfVotes + " votes";
    }
}
