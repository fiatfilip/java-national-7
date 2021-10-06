package ro.siit.session29.sync;

import javax.naming.CompositeName;

public class Incrementor extends Thread {
    @Override
    public void run() {
        Counter.increment();
    }

    public static void main(String[] args) throws InterruptedException {
        Incrementor[] incrementors = new Incrementor[10];
        for (int i = 0; i < incrementors.length; i++) {
            incrementors[i] = new Incrementor();
            incrementors[i].start();
        }

        for (Incrementor incrementor: incrementors) {
            incrementor.join();
        }

        System.out.println(Counter.count);
    }
}
