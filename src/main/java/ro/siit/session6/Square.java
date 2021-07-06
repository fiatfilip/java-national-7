package ro.siit.session6;

public class Square extends Rectangle{
    public void calculateArea(){

    }

    public double getArea(double a){
        System.out.println("get area from Square");
        return getArea(a, a);
    }

    @Override
    // cu metoda asta fac suprascirerea metodei din parent
    public void draw(){
        System.out.println("Draw a square!");
    }

    // Child extends Parent
    // Parent object = new Child();
    // object.metohod();

    public static void main(String[] args) {
        Square square = new Square();
        square.getArea(2);
        square.getArea(2,2);
    }
}
