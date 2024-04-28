package g59939.atlg3.ascii.model;

import java.util.*;

public class Drawing {
    private ArrayList<Shape> shapes;
    private int height;
    private int width;

    private final int DEFAULT_WIDTH = 30;
    private final int DEFAULT_HEIGHT = 50;


    public Drawing() {
        height = DEFAULT_HEIGHT;
        width = DEFAULT_WIDTH;
        shapes = new ArrayList<>();
    }

    public Drawing(int height, int width) {
        this.height = height;
        this.width = width;
        shapes = new ArrayList<>();
    }

    public ArrayList<Shape> getShapes(){
        return shapes;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public Shape getShapeAt(Point point) {
        for(Shape shape : shapes) {
            if (shape.isInside(point))
                return shape;
        }
        return null;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    // cool ça !
    public void clearShapes(){
        shapes.clear();
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + shapes +
                '}';
    }
}
