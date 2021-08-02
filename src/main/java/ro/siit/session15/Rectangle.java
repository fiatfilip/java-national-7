package ro.siit.session15;

import java.util.Scanner;

public class Rectangle implements Shape{
    private double width, height;
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static Rectangle readRectangle(Scanner keyboard){
        Rectangle rectangle = new Rectangle();

        do {
            System.out.println("Type rectangle's width");
            String widthAsString = keyboard.nextLine();
            try {
                rectangle.width = Double.parseDouble(widthAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (rectangle.width <= 0.0);

        do {
            System.out.println("Type rectangle's height");
            String heightAsString = keyboard.nextLine();
            try {
                rectangle.height = Double.parseDouble(heightAsString);
            } catch (NumberFormatException numberFormatException){
                System.out.println("Type a valid positive value");
            }
        } while (rectangle.height <= 0.0);

        return rectangle;
    }

    public static Rectangle readRectangle(Double width, Double height){
        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    @Override
    public boolean isSimilar(Shape shape) {
        if (shape instanceof Rectangle &&
                width / ((Rectangle)shape).width
                        == height / ((Rectangle)shape).height){
            return true;
        }
        return false;
    }
}
