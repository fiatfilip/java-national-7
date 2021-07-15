package ro.siit.session9.interfaces;

public class Implementation implements Interface1, Interface2{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public Double m3() {
        return null;
    }

    @Override
    public String m2() {
        return null;
    }

    public static void main(String[] args) {
        Implementation impl1 = new Implementation();
        impl1.m1();
    }
}
