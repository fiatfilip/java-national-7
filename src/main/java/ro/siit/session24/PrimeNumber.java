package ro.siit.session24;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {

        /*IntStream.range(0,101)
                .filter(x -> x%2 != 0)
                .forEach(System.out::println);*/

        IntStream.range(1,1001)
                .filter(x -> {
                    return !IntStream.range(2, (int)Math.sqrt(x)+1)
                            .anyMatch(y -> x%y==0);
                }).
                forEach(System.out::println);
    }

}
