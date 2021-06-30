package ro.siit.session6;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        // Square impossible = shape;
        Square square = new Square();
        square.draw();
        System.out.println(square.getArea(5.0, 6.0));
        Rectangle anotherRectangle = new Rectangle();
        ComposedSquare cSquare = new ComposedSquare();
        cSquare.setAnother(anotherRectangle);
        anotherRectangle.getArea(2,4);
        cSquare.getArea(2.0);
        square.calculateArea();
        Circle circle = new Circle();
        circle.draw();

        Shape shape2 = square;
        shape2.draw();
        // shape2.calculateArea();
        Shape[] shapes = new Shape[3];
        shapes[0] = shape;
        shapes[1] = square;
        // shapes[1].calculateArea();
        shapes[2] = circle;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }


    }
}
