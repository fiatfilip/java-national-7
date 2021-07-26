package ro.siit.session13.parameterized;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    public void managePersons(List<? extends Person> persons){
        for (Person p: persons) {
            System.out.println(p);
        }

        // persons.add(new Child());

    }

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        List<Child> children = new ArrayList<>();
        personManager.managePersons(children);

        List<Adult> adults = new ArrayList<>();
        personManager.managePersons(adults);
    }


}
