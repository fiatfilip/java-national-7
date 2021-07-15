package ro.siit.session9.accessControl.superUsage;

public class Employee {
    public double calculatePay() {
        System.out.println("Parent method");
        return 1000;
    }
}
