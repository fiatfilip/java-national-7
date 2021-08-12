package ro.siit.session17;

import ro.siit.session16.arrays.Employee;
import ro.siit.session16.arrays.Employer;
import ro.siit.session16.arrays.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        List<Person> persons  = new LinkedList<>();
        persons.add(new Employee("123Employee"));
        persons.add(new Employer("432Employer"));

        persons.add(new Person() {
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
        });

        for (Person person: persons) {
            System.out.println(person);
        }

        System.out.println("--------");

        for(int i = 0; i < persons.size(); i=i+1){
            System.out.println(persons.get(i));
        }
    }
}
