package ro.siit.session29.randomsum;

import java.util.Arrays;

public class RandomSum {
    public static void main(String[] args) {
        RandomNumber[] numbers = new RandomNumber[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new RandomNumber();
            numbers[i].start();
        }

        for (RandomNumber randomNumberGenerator: numbers) {
            try {
                randomNumberGenerator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                Arrays.stream(numbers)
                        .map(r-> r.getNumber())
                        // .reduce(0, (n1, n2) -> n1+n2)
                        .reduce(0, Integer::sum)
        );

    }
}
