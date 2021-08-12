package ro.siit.session18;

import java.util.*;

public class MainComparableVsEquals {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Car(20));
        Vehicle truckFromGranny = new Truck(2000);
        vehicles.add(truckFromGranny);
        Vehicle carFromGranny = new Car(2000);
        vehicles.add(carFromGranny);
        vehicles.add(new Car(200));
        vehicles.add(new Truck(2000000));

        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

        System.out.println(truckFromGranny.equals(carFromGranny));
        System.out.println(truckFromGranny.compareTo(carFromGranny));

        List<Vehicle> vehicleList = new ArrayList();
        vehicleList.addAll(vehicles);
        Collections.sort(vehicleList);

        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle);
        }
    }
}
