package ro.siit.session24;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Jonathan Boyle",
                "Marcus Kopernic",
                "Sebastian Blade",
                "Olivia Toe",
                "Larissa McMannor"
        };

        System.out.println(Searcher.exists(names, "nathan"));

        Stream.of(Searcher.search(names, "la"))
                .forEach(name -> System.out.println(name));

    }
}
