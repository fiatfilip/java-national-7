package ro.siit;

public class Sandbox {
    public static void main(String[] args) {
        double v1 = Double.parseDouble(args[0]);
        double v2 = Double.parseDouble(args[1]);
        switch (args[2]){
            case "+": System.out.println(v1+v2);break;
            case "*": System.out.println(v1*v2);break;
            default: System.out.println("invalid");
        }
    }
}
