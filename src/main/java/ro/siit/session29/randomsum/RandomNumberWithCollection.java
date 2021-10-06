package ro.siit.session29.randomsum;

import java.util.List;
import java.util.Random;

public class RandomNumberWithCollection extends Thread{
    private List<Integer> collection;
    public RandomNumberWithCollection(List<Integer> collection){
        this.collection = collection;
    }

    @Override
    public void run() {
        Random randomizer = new Random();
        int number = randomizer.nextInt(10) + 1;
        System.out.println(Thread.currentThread().getName() + ": " + number);
        this.collection.add(number);
    }
}
