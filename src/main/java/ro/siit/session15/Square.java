package ro.siit.session15;

import java.util.Scanner;

public class Square implements Shape{
    private double edge;
    @Override
    public double getArea() {
        return Math.pow(edge,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * edge;
    }

    public static Square readSquare(Scanner keyboard){
        Square square = new Square();

        do {
            System.out.println("Type square's edge");
            String edgeAsString = keyboard.nextLine();
            try {
                square.edge = Double.parseDouble(edgeAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (square.edge <= 0.0);

        return square;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    public static Square readSquare(Double edge) {
        Square square = new Square();
        square.edge = edge;
        return square;
    }

    @Override
    public boolean isSimilar(Shape shape) {
        if (shape instanceof Square && edge == ((Square)shape).edge){
            return true;
        }
        return false;
    }
}
