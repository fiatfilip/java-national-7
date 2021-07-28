package ro.siit.session14.polymorphism;

public class Doctor extends Employee implements Vaccinated{
    public Doctor(Double salary) {
        super(salary);
    }

    @Override
    public Double getSalary() {
        System.out.println("Calling Doctor.getSalary()");
        return 1.1 * super.getSalary();
    }

    @Override
    public void showVaccinationCertificate() {
        String className = this.getClass().getName();
        System.out.println(className.substring(className.lastIndexOf(".") + 1) + "-vaccinated");
    }
}
