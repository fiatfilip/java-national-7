package ro.siit.session21;

import java.util.*;
import java.util.stream.Stream;

public class Laptop {
    private String manufacturer;
    private Integer ram;

    public Laptop(String manufacturer, int ram) {
        this.manufacturer = manufacturer;
        this.ram = ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return  manufacturer + " cu " + ram + " GB RAM ";
    }

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Mac", 16));
        laptops.add(new Laptop("Dell", 128));
        laptops.add(new Laptop("Lenovo", 32));
        laptops.add(new Laptop("Mac", 32));

        for (Laptop laptop: laptops) {
            System.out.println(laptop);
        }
        System.out.println("------------");
        Collections.sort(laptops, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o1.getRam().compareTo(o2.getRam());
            }
        });
        for (Laptop laptop: laptops) {
            System.out.println(laptop);
        }
        System.out.println("------------");

        Collections.sort(laptops, (laptop1, laptop2)
                -> laptop1.getManufacturer()
                    .compareToIgnoreCase(laptop2.getManufacturer()));

        for (Laptop laptop: laptops) {
            System.out.println(laptop);
        }

        for (Laptop laptop: laptops) {
            if(laptop.getRam()> 16){
                System.out.println(laptop);
            }
        }

        Stream<Laptop> stream =  laptops.stream();
        stream
                .filter(laptop -> laptop.getRam()>16)
                .filter(laptop -> laptop.getManufacturer()
                        .startsWith("M"))
                .forEach(System.out::println);

        stream =  laptops.stream();
        stream
                .filter(laptop -> laptop.getManufacturer()
                        .startsWith("M")).forEach(System.out::println);

    }
}
