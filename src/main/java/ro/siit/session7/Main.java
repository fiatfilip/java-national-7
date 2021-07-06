package ro.siit.session7;

public class Main {
    public static void main(String[] args) {
        Person vinDiesel = new Person();
        vinDiesel.setName("Diesel");
        vinDiesel.setSurname("Vin");
        vinDiesel.setAge(53);
        vinDiesel.setGender(Gender.M);
        System.out.println(vinDiesel.toString());
        vinDiesel.setAge(54);
        System.out.println(vinDiesel.toString());

        Person jasonMamoa = new Person("Jason", "Mamoa", 35, Gender.M);
        System.out.println(jasonMamoa.toString());

        Person madonna = new Person("Madonna", 70, Gender.F);
        System.out.println(madonna.toString());

        if(madonna.getAge() < 69) {
            System.out.println("Still singing!");
        }
    }
}
