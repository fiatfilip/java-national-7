package ro.siit.session24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListPalindroms {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("roman");
        words.add("radar");
        words.add("Madam");

        List<String> palindroms = words.stream()
                .filter(word -> {
                    String reverse = new StringBuilder(word).reverse().toString();
                    return reverse.equalsIgnoreCase(word);
                })
                //.forEach(System.out::println);
                .collect(Collectors.toList());

        palindroms.parallelStream().forEach(System.out::println);

    }
}
