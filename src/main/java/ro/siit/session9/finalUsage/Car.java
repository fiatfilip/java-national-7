package ro.siit.session9.finalUsage;

public class Car {
    final String chassisNumer;
    private String carType;

    public Car(){
        this.chassisNumer = "123";
    }

    public Car(String chassisNumer){
        this.chassisNumer = chassisNumer;
    }

    public Car(String chassisNumer, String carType){
        this.chassisNumer = chassisNumer;
        this.carType = carType;
    }

    public final String getChassisNumber() {
        return chassisNumer;
    }

    public static void main(String[] args) {
        Car c1 = new Car("abc");
        // c1.chassisNumer = "zzz";

        Car c2 = new Dacia("aaaaaaa");
    }
}
