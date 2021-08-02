package ro.siit.session15;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ShapesManagerTest {
    @Test
    public void addSquareWorks(){
        ShapesManager shapesManager = new ShapesManager();
        Square square = Square.readSquare(2.0);
        Assert.assertEquals(true, shapesManager.addShape(square));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(square, shapesManager.getShapes().get(0));
    }

    @Test
    public void addTriangleWorks(){
        ShapesManager shapesManager = new ShapesManager();
        Triangle triangle = Triangle.readTriangle(1.0, 2.0,2.0);
        Assert.assertEquals(true, shapesManager.addShape(triangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(triangle, shapesManager.getShapes().get(0));
    }

    @Test
    public void addCircleWorks(){
        ShapesManager shapesManager = new ShapesManager();
        Circle circle = Circle.readCircle(1.0);
        Assert.assertEquals(true, shapesManager.addShape(circle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(circle, shapesManager.getShapes().get(0));
    }

    @Test
    public void addRectangleWorks(){
        ShapesManager shapesManager = new ShapesManager();
        Rectangle rectangle = Rectangle.readRectangle(2.0, 3.0);
        Assert.assertEquals(true, shapesManager.addShape(rectangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(rectangle, shapesManager.getShapes().get(0));
    }

    @Test
    public void duplicateSquaresAreNotAllowed(){
        ShapesManager shapesManager = new ShapesManager();
        Square square = Square.readSquare(2.0);
        Assert.assertEquals(true, shapesManager.addShape(square));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(square, shapesManager.getShapes().get(0));

        Square duplicateSquare = Square.readSquare(2.0);
        Assert.assertEquals(false, shapesManager.addShape(duplicateSquare));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(square, shapesManager.getShapes().get(0));
    }

    @Test
    public void duplicateTrianglesAreNotAllowed(){
        ShapesManager shapesManager = new ShapesManager();
        Triangle triangle = Triangle.readTriangle(1.0, 2.0,2.0);
        Assert.assertEquals(true, shapesManager.addShape(triangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(triangle, shapesManager.getShapes().get(0));

        Triangle duplicateTriangle = Triangle.readTriangle(3.0, 6.0,6.0);
        Assert.assertEquals(false, shapesManager.addShape(duplicateTriangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(triangle, shapesManager.getShapes().get(0));
    }

    @Test
    public void duplicateCirclesAreNotAllowed(){
        ShapesManager shapesManager = new ShapesManager();
        Circle circle = Circle.readCircle(1.0);
        Assert.assertEquals(true, shapesManager.addShape(circle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(circle, shapesManager.getShapes().get(0));

        Circle duplicateCircle = Circle.readCircle(1.0);
        Assert.assertEquals(false, shapesManager.addShape(duplicateCircle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(circle, shapesManager.getShapes().get(0));
    }

    @Test
    public void duplicateRectanglesAreNotAllowed(){
        ShapesManager shapesManager = new ShapesManager();
        Rectangle rectangle = Rectangle.readRectangle(2.0, 3.0);
        Assert.assertEquals(true, shapesManager.addShape(rectangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(rectangle, shapesManager.getShapes().get(0));

        Assert.assertEquals(false, shapesManager.addShape(rectangle));
        Assert.assertEquals(1, shapesManager.getShapes().size(),0);
        Assert.assertEquals(rectangle, shapesManager.getShapes().get(0));
    }

    @Test
    public void totalAreaWorks(){
        Random randomizer = new Random();
        ShapesManager shapesManager = new ShapesManager();

        Double circleRadius = randomizer.nextDouble();
        Circle circle = Circle.readCircle(circleRadius);
        Double circleArea = Math.PI * Math.pow(circleRadius, 2);
        shapesManager.addShape(circle);

        Double squareEdge = randomizer.nextDouble();
        Square square = Square.readSquare(squareEdge);
        Double squareArea = Math.pow(squareEdge, 2);
        shapesManager.addShape(square);

        Assert.assertEquals(circleArea + squareArea, shapesManager.getTotalArea(), 0);
    }

    @Test
    public void totalPerimeterWorks(){
        Random randomizer = new Random();
        ShapesManager shapesManager = new ShapesManager();

        Double circleRadius = randomizer.nextDouble();
        Circle circle = Circle.readCircle(circleRadius);
        Double circlePerimeter = 2 * Math.PI * circleRadius;
        shapesManager.addShape(circle);

        Double squareEdge = randomizer.nextDouble();
        Square square = Square.readSquare(squareEdge);
        Double squarePerimeter = 4 * squareEdge;
        shapesManager.addShape(square);

        Assert.assertEquals(circlePerimeter + squarePerimeter, shapesManager.getTotalPerimeter(), 0);
    }
}
