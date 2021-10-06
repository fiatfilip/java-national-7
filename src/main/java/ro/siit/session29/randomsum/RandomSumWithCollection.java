package ro.siit.session29.randomsum;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RandomSumWithCollection {
    public static void main(String[] args) {
        List<Integer> theCollection = new Vector();//new ArrayList<>();
        RandomNumberWithCollection[] numbers = new RandomNumberWithCollection[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new RandomNumberWithCollection(theCollection);
            numbers[i].start();
        }

        for (RandomNumberWithCollection randomNumberGenerator: numbers) {
            try {
                randomNumberGenerator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(theCollection.stream().reduce(0, Integer::sum));
    }
}
