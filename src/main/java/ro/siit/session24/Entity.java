package ro.siit.session24;

import java.util.Comparator;
import java.util.stream.Stream;

public class Entity implements Comparable<Entity>{
    String prop1;
    Integer prop2;

    public Entity(String prop1, Integer prop2){
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public static void main(String[] args) {
        Entity[] entities = {
                new Entity("EEE", 10),
                new Entity("CCC", 4),
                new Entity("ZZZ", 1)
        };

        Stream.of(entities)
                .sorted()
                .forEach(System.out::println);

        System.out.println("------");

        Stream.of(entities)
                // .sorted((e1, e2) -> e1.prop2.compareTo(e2.prop2))
                .sorted(Comparator.comparing(e -> e.prop2))
                .forEach(System.out::println);
    }

    @Override
    public int compareTo(Entity o) {
        return this.prop1.compareTo(o.prop1);
    }

    @Override
    public String toString() {
        return "Entity{" +
                 prop1 +
                ", " + prop2 +
                '}';
    }
}
