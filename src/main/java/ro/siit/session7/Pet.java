package ro.siit.session7;

public class Pet {
    private String name;
    public Pet(){
        this("Thomas");
        System.out.println("Pet() called");
    }

    public Pet(String name){
        System.out.println("Pet(with params) called");
        this.name = name;
    }
}
