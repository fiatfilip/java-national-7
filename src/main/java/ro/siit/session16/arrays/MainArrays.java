package ro.siit.session16.arrays;

public class MainArrays {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[1] = new Employee("123Employee");
        persons[2] = new Employer("432Employer");

        persons[0] = new Person() {
            @Override
            public String getCNP() {
                return "Annonimous1223";
            }

            @Override
            public String toString() {
                return "Annonimous{" +
                        "cnp='" + getCNP() + '\'' +
                        '}';
            }
        };

        for (Person person: persons) {
            System.out.println(person);
        }

        int x = 7;
        int[] arr = new int[x];
        x = 8;
        System.out.println(arr.length);

        // arr.length = 21;

        int[] altSir = new int[Integer.parseInt(args[0])];
        //....
    }
}
