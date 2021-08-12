package ro.siit.session17;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new TreeSet<>();

        vehicles.add(new Vehicle("QWERTY1", 1));
        vehicles.add(new Vehicle("QWERTY2", 7));
        vehicles.add(new Vehicle("aQWERTY1bis", 7));
        vehicles.add(new Vehicle("QWERTY3", 3));
        vehicles.add(new Vehicle("QWERTY4", 19));
        vehicles.add(new Vehicle("aaaaQWERTY4", 19));
        vehicles.add(new Vehicle("QWERTY5", 19));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("------");

        Set<Vehicle> vehiclesByAge = new TreeSet<>(new VehiclesAgeComparator());
        vehiclesByAge.addAll(vehicles);
        vehiclesByAge.add(new Vehicle("aQWERTY1bis", 7));
        vehiclesByAge.add(new Vehicle("aaaaQWERTY4", 19));
        vehiclesByAge.add(new Vehicle("QWERTY5", 19));

        for (Vehicle vehicle: vehiclesByAge) {
            System.out.println(vehicle);
        }
    }
}
