package ro.siit.session15;

import java.util.ArrayList;
import java.util.List;

public class ShapesManager {
    private List<Shape> shapes = new ArrayList<>();

    public boolean addShape(Shape shapeToAdd){
        boolean isSimilar = false;
        for (Shape shape: shapes) {
            if(shapeToAdd.isSimilar(shape)){
                isSimilar = true;
                break;
            }
        }

        if( isSimilar ){
            return false;
        } else {
            shapes.add(shapeToAdd);
            return true;
        }
    }

    public List<Shape> getShapes() {
        List<Shape> shapesToReturn = new ArrayList<>();
        shapesToReturn.addAll(shapes);
        return shapesToReturn;
    }

    public double getTotalArea(){
        double area = 0.0;
        for (Shape shape: shapes) {
            area += shape.getArea();
        }

        return area;
    }

    public double getTotalPerimeter(){
        double perimeter = 0.0;
        for (Shape shape: shapes) {
            perimeter += shape.getPerimeter();
        }

        return perimeter;
    }
}
