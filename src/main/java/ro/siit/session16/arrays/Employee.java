package ro.siit.session16.arrays;

public class Employee implements Person{
    private String cnp;

    public Employee(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String getCNP() {
        return null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "cnp='" + cnp + '\'' +
                '}';
    }
}
