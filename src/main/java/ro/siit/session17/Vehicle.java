package ro.siit.session17;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
    private String serial;
    private int age;

    public Vehicle(String serial, int age) {
        this.serial = serial;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "serial='" + serial + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return age == vehicle.age && serial.equalsIgnoreCase(vehicle.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, age);
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.age - o.age;

        // return this.serial.compareTo(o.serial);
    }

    public int getAge() {
        return age;
    }

    public String getSerial() {
        return serial;
    }
}
