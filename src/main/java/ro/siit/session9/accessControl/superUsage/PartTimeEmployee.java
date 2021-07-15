package ro.siit.session9.accessControl.superUsage;

public class PartTimeEmployee extends Employee{
    @Override
    public double calculatePay() {
        System.out.println("Child method");
        return 0.9 * super.calculatePay();
    }
}
