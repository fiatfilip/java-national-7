package ro.siit.session15;

import java.util.Scanner;

public class Circle implements Shape{
    private double radius;
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean isSimilar(Shape shape) {
        if (shape instanceof Circle && radius == ((Circle)shape).radius){
            return true;
        }
        return false;
    }

    public static Circle readCircle(Scanner keyboard){
        Circle circle = new Circle();
        do {
            System.out.println("Type circle's radius");
            String radiusAsString = keyboard.nextLine();
            try {
                circle.radius = Double.parseDouble(radiusAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (circle.radius <= 0.0);

        return circle;
    }

    public static Circle readCircle(Double radius){
        Circle circle = new Circle();
        circle.radius = radius;
        return circle;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
