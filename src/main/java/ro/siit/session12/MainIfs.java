package ro.siit.session12;

public class MainIfs {
    public static void main(String[] args) {
        if(args.length > 0 && args[0] != null) {
            System.out.println(args[0]);
        } else {
            System.out.println("Nu ati dat argumente!");
        }
    }
}
