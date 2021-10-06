package ro.siit.session29.randomsum;

import java.util.Random;

public class RandomNumber extends Thread{
    private int number;
    @Override
    public void run() {
        Random randomizer = new Random();
        this.number = randomizer.nextInt(10) + 1;
        System.out.println(Thread.currentThread().getName() + ": " + this.number);
    }

    public int getNumber() {
        return number;
    }
}
