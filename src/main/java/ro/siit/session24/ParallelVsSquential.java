package ro.siit.session24;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelVsSquential {
    public static void main(String[] args) {
        String[] elements = {"one", "two", "three"};
        Stream.of(elements)
                .sorted()
                .forEach(System.out::println);
        System.out.println(".........");
        Stream.of(elements)
                .parallel()
                .sorted()
                .forEach(System.out::println);
        System.out.println(".........");

        IntStream.range(0, elements.length)
                .forEach(i -> System.out.println(elements[i]));

        // Stream elementsStream = Stream.of(elements);
        Stream.of(elements).forEach(System.out::println);
        Stream.of(elements).filter(s->s.toString().startsWith("o"));

        Supplier<Stream<String>> elementsStreamSupplier = () -> Stream.of(elements);

        elementsStreamSupplier.get().forEach(System.out::println);
    }
}
