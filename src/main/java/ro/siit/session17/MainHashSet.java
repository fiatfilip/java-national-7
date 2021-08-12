package ro.siit.session17;

import ro.siit.session9.interfaces.Person;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Set<Vehicle> vehicles  = new HashSet<>();

        vehicles.add(new Vehicle("QWERTY", 1));
        vehicles.add(new Vehicle("QWERTY", 1));
        vehicles.add(new Vehicle("QWERTY", 1));
        vehicles.add(new Vehicle("QWERTY", 1));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
