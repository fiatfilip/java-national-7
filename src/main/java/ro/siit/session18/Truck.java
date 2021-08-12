package ro.siit.session18;

public class Truck extends Vehicle{
    public Truck(long mileage) {
        super(mileage);
    }

    public Truck(long mileage, String identifier) {
        super(mileage, identifier);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + " : " + super.toString();
    }

}
