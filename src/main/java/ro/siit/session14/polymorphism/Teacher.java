package ro.siit.session14.polymorphism;

public class Teacher extends Employee implements Vaccinated{
    public Teacher(Double salary) {
        super(salary);
    }

    @Override
    public Double getSalary() {
        System.out.println("Calling Teacher.getSalary()");
        return 0.9 * super.getSalary();
    }

    @Override
    public void showVaccinationCertificate() {
        System.out.println(this.getClass().getSimpleName() + "-vaccinated");
    }
}
