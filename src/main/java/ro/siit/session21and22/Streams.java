package ro.siit.session21and22;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println(
                IntStream.range(0, 100)
                .reduce(0, (x, y) -> x+y)
        );


        List<Integer> integersLists =Arrays.asList(1, 2, 3);
        List<Integer> doubleIntegersLists = integersLists.stream()
                .map(elem -> 2 * elem)
                .collect(Collectors.toList());

        IntStream.rangeClosed(1,10).map(e -> {
            System.out.println(e + " va fi dublat");
            return 2 * e;
        }).map(e -> {
            System.out.println(e + " va fi triplat");
            return 3 * e;
        }).forEach(System.out::println);

    }
}
