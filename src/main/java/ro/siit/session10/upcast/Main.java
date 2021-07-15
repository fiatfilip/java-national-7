package ro.siit.session10.upcast;

public class Main {
    public static void main(String[] args) {
        Car c = (Car) new Truck();
        c.m();
    }
}
