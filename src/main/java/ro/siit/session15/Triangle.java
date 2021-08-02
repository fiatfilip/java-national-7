package ro.siit.session15;

import java.util.Scanner;

public class Triangle implements Shape{
    private double a, b, c;
    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public static Triangle readTriangle(Scanner keyboard){
        Triangle triangle = new Triangle();

        do {
            System.out.println("Type triangle's a edge");
            String aAsString = keyboard.nextLine();
            try {
                triangle.a = Double.parseDouble(aAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (triangle.a <= 0.0);

        do {
            System.out.println("Type triangle's b edge");
            String bAsString = keyboard.nextLine();
            try {
                triangle.b = Double.parseDouble(bAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (triangle.b <= 0.0);

        do {
            System.out.println("Type triangle's c edge");
            String cAsString = keyboard.nextLine();
            try {
                triangle.c = Double.parseDouble(cAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (triangle.c <= 0.0);

        return triangle;
    }

    public static Triangle readTriangle(Double a, double b, double c){
        Triangle triangle = new Triangle();
        triangle.a = a;
        triangle.b = b;
        triangle.c = c;
        return triangle;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    @Override
    public boolean isSimilar(Shape shape) {
        if (shape instanceof Triangle &&
                a / ((Triangle)shape).a
                        == b / ((Triangle)shape).b &&
                b / ((Triangle)shape).b
                        == c / ((Triangle)shape).c){
            return true;
        }
        return false;
    }
}
