package ro.siit.session30;

public class ElectionProcess {
    public static void main(String[] args) {
        System.out.println("Election process started.");
        Ballot electionBallot = new Ballot();

        Thread presenceCounter = new Thread(new PresenceCounter(electionBallot));
        // presenceCounter.setDaemon(true);
        presenceCounter.start();

        int noOfVoters = 1000;
        Voter[] voters = new Voter[noOfVoters];
        for (int i = 0; i < voters.length; i++) {
            voters[i] = new Voter(electionBallot);
            voters[i].start();
        }

        for (int i = 0; i < voters.length; i++) {
            try {
                voters[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            presenceCounter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Election process ended.");
        electionBallot.printResults();
    }
}
