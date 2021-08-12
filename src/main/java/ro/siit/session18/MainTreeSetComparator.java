package ro.siit.session18;

import java.util.*;

public class MainTreeSetComparator {
    public static void main(String[] args) {
        Comparator<Vehicle> vehicleIdComparator = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getIdentifier().compareTo(o2.getIdentifier());
            }
        };
        Set<Vehicle> vehicles = new TreeSet<>(vehicleIdComparator);
        vehicles.add(new Car(20, "Logan7"));
        Vehicle truckFromGranny = new Truck(2000, "Peterbilt12");
        vehicles.add(truckFromGranny);
        Vehicle carFromGranny = new Car(2000, "Logan1");
        vehicles.add(carFromGranny);
        vehicles.add(new Car(200, "Laguna3"));
        vehicles.add(new Truck(2000000, "WVbeetle2"));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
