package ro.siit.session30;

import java.util.Random;

public class Voter extends Thread{

    private Ballot ballot;

    public Voter(Ballot ballot){
        this.ballot = ballot;
    }

    public void vote() {
        Random randomizer = new Random();
        int delay = randomizer.nextInt(60 * 1000);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Candidate[] candidates = Candidate.values();
        int candidateIndex = randomizer.nextInt(candidates.length);
        Vote vote = new Vote(candidates[candidateIndex]);
        this.ballot.castVote(vote);
    }

    @Override
    public void run() {
        vote();
    }
}
