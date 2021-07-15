package ro.siit.session9.interfaces;

public class Main {
    public static void main(String[] args) {
        Person[] prs = new Person[2];
        prs[0] = new Child();
        prs[1] = new Adult();

        Adult a1 = (Adult)prs[1];
        a1.showDrivingLicense();

        Driver[] drivers = new Driver[2];
        drivers[0] = new Adult();
        // drivers[0] = new Driver();
        drivers[1] = new Martian();
        for (Driver driver:drivers) {
            driver.showDrivingLicense();
        }
    }
}
