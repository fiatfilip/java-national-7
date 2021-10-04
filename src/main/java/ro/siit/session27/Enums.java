package ro.siit.session27;

public class Enums {
    public static  void main(String[] args) {
        Season winter = Season.WINTER;

        System.out.println(winter.name());

        String name = "WINTER";

        System.out.println(Season.valueOf(name));
    }
}
