package ro.siit.session24;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Searcher {
    public static boolean exists(String[] collection, String searchTerm){
        return Stream.of(collection)
                .parallel()
                .map(term -> term.toUpperCase())
                .anyMatch(term -> term.contains(searchTerm.toUpperCase()));
    }

    public static String[] search(String[] collection, String searchTerm) {
        List<String> filteredCollection = Stream.of(collection)
                .map(term -> term.toUpperCase())
                .filter(term -> term.contains(searchTerm.toUpperCase()))
                .collect(Collectors.toList());

        return filteredCollection.toArray(new String[filteredCollection.size()]);
    }

}
