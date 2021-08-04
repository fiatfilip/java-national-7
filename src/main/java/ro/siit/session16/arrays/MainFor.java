package ro.siit.session16.arrays;

public class MainFor {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // String salut = hello();

        String salut = sayHello();
        System.out.println(salut);
    }

    public static void hello(){
        System.out.println("Hello");
    }

    public static String sayHello(){
        System.out.println("Hello----");
        return "Hello";
    }
}
