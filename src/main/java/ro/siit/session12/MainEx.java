package ro.siit.session12;

public class MainEx {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
        } catch (Exception exception){
            System.out.println("Nu ati dat argumente!");
        }
    }
}
