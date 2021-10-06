package ro.siit.session30;

import java.util.Date;

public class PresenceCounter implements Runnable{

    private Ballot ballot;

    public PresenceCounter(Ballot ballot) {
        this.ballot = ballot;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date() + " So far, " + ballot.currentNoOfVoters() + " voted.");
        } while(this.ballot.currentNoOfVoters() < 1000);
    }
}
