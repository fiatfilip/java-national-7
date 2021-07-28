package ro.siit.session14.polymorphism;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList= new ArrayList();

    public void hire(Employee employee){
        employeeList.add(employee);
    }

    public Double salaryAmount(){
        Double salaryAmount = 0.0;
        for (Employee employee: employeeList) {
            salaryAmount += employee.getSalary();
        }

        return salaryAmount;
    }

    public void listSalaries(){
        for (Employee employee: employeeList) {
            System.out.println(employee.getSalary());
        }
    }

    public List<Vaccinated> getVaccinatedEmployees(){
        List<Vaccinated> vaccinatedList = new ArrayList<>();
        for (Employee employee: employeeList) {
            if(employee instanceof Doctor){
                vaccinatedList.add((Vaccinated) employee);
            } else if (employee instanceof Teacher){
                vaccinatedList.add((Teacher)employee);
            }
        }

        return vaccinatedList;
    }

    public static void main(String[] args) {
        Company state = new Company();
        Teacher teacher = new Teacher(3000.0);
        state.hire(teacher);
        state.hire(new Doctor(6000.0));
        state.hire(new Employee(1600.0));
        state.hire(new Doctor(5600.0));

        System.out.println(state.salaryAmount());

        System.out.println("Teacher salary " + teacher.getSalary());
        System.out.println("Teacher salary increased " +  String.format("%.2f", teacher.getSalary(20.1)));
        System.out.println("Teacher salary increased with currency" + teacher.getSalary(20.1, "RON"));

        state.listSalaries();

        for(Vaccinated vaccinated : state.getVaccinatedEmployees()){
            vaccinated.showVaccinationCertificate();
        }
    }
}
