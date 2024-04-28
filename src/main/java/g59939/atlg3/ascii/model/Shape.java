package g59939.atlg3.ascii.model;

public interface Shape {
    boolean isInside(Point p);
    void move(double dx, double dy);
    char getColor();
}
