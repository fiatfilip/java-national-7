package ro.siit.session6;

public class Square extends Rectangle{
    public void calculateArea(){

    }

    public double getArea(double a){
        return getArea(a, a);
    }

    @Override
    // cu metoda asta fac suprascirerea metodei din parent
    public void draw(){
        System.out.println("Draw a square!");
    }
}
