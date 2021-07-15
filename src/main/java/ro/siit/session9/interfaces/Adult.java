package ro.siit.session9.interfaces;

public class Adult extends Person implements Driver{
    public void showDrivingLicense(){
        System.out.println("Adult driving");
    }
}
