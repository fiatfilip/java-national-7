package ro.siit.session19.overloadOverride;

public class B extends A{
    @Override
    public void m2(){
        System.out.println(this.getClass() + ":m2()");
        super.m2();
    }

    public void m3(){
        System.out.println(this.getClass() + ":m3()");
    }

    public void m3(int a){
        System.out.println(this.getClass() + ":m3(" + a +")");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1();
        // b.m3();
        b.m2();

        b.m3();
        b.m3(2);
    }
}
