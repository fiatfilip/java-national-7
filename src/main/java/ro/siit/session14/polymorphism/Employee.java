package ro.siit.session14.polymorphism;

public class Employee {
    private Double salary;

    public Employee(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println("Call Employee.getSalary()");
        return salary;
    }

    public Double getSalary(Double percent){
        System.out.println("Calling Employee.getSalary(percentage)");
        return (100 + percent) / 100 * salary;
    }

    public String getSalary(Double percent, String currency){
        System.out.println("Calling Employee.getSalary(percentage, currency)");
        return String.format("%.2f", (100 + percent) / 100 * salary) + currency;
    }
}
