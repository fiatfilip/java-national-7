package ro.siit.session17;

import java.util.Comparator;

public class VehiclesAgeComparator  implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        int c = o1.getAge() - o2.getAge();
        if (c == 0){
            c = o1.getSerial().toLowerCase().compareTo(o2.getSerial().toLowerCase());
        }
         return c;
    }
}
