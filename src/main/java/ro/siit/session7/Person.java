package ro.siit.session7;

public class Person {
    private String name = "John Doe";
    private String surname;
    private Integer age;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person (String name, Integer age, Gender gender){
        System.out.println("S-a apelat constructorul cu 4 parametrii");
        this.name = name;
        this.age = age;
        this.gender = gender;

        if(this.gender.equals(Gender.F)){
            this.age = this.age-10;
        }
    }

    public Person (String name, String surname, Integer age, Gender gender){
        this(name, age, gender);
        this.surname = surname;
    }

    public Person(){
        this.name = "Doe";
        this.surname = "John";
        this.gender = Gender.M;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
