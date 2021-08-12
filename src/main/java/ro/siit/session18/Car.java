package ro.siit.session18;

public class Car extends Vehicle {

    public Car(long mileage) {
        super(mileage);
    }
    public Car(long mileage, String identifier) {
        super(mileage, identifier);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " : " + super.toString();
    }
}
