package ro.siit.session18;

public class Vehicle implements Comparable<Vehicle>{
    private String identifier;
    private Long mileage;

    public Vehicle(long mileage) {
        this.mileage = mileage;
    }

    public Vehicle(Long mileage, String identifier){
        this(mileage);
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mileage=" + mileage +
                "identifier" + identifier +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
//        if(this.mileage == o.mileage){
//            return 0;
//        } else if (this.mileage > o.mileage){
//            return -1;
//        }else {
//            return 1;
//        }
        // return this.mileage - o.mileage;
        return this.mileage.compareTo(o.mileage);
    }

    public String getIdentifier() {
        return identifier;
    }
}
