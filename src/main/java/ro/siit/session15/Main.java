package ro.siit.session15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapesManager shapesManager = new ShapesManager();
        readShapes(shapesManager);
        for (Shape shape:shapesManager.getShapes()){
            System.out.println(shape);
        }
    }

    private static void readShapes(ShapesManager shapesManager) {

        Scanner keyboard = new Scanner(System.in);
        String cmd;
        do {
            displayMainMenu();
            String shapeType = keyboard.nextLine();
            Shape shape = null;
            switch (shapeType){
                case "C":
                    shape = Circle.readCircle(keyboard);
                    break;
                case "S":
                    shape = Square.readSquare(keyboard);
                    break;
                case "T":
                    shape = Triangle.readTriangle(keyboard);
                    break;
                case "R":
                    shape = Rectangle.readRectangle(keyboard);
                    break;
                default:
                    System.out.println("Invalid shape");
            }

            if(shape != null){
                boolean addResult = shapesManager.addShape(shape);
                if(!addResult) {
                    System.err.println("A similar shape already exists!");
                }
            }

            System.out.println("Type A to read one more shape / Type X to stop reading shapes");
            cmd = keyboard.nextLine();
        } while (!"X".equalsIgnoreCase(cmd));
    }

    private static void displayMainMenu(){
        System.out.println("Type");
        System.out.println("C - to read a circle");
        System.out.println("S - to read a square");
        System.out.println("T - to read a triangle");
        System.out.println("R - to read a rectangle");
    }
}
