package ro.siit.session6;

public class ComposedSquare extends Thread{
    private Rectangle innerRectangle = new Rectangle();
    private Rectangle another;
    public double getArea(double a){
        return innerRectangle.getArea(a, a);
    }

    public void setAnother(Rectangle another) {
        this.another = another;
    }
}
