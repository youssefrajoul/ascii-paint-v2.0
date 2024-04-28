package g59939.atlg3.ascii.model;

public class Rectangle extends ColoredShape {
    private Point upperLeft;
    private double width;
    private double height;

    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        // tu peux vérifier si width et height sont >0
        this.upperLeft = new Point(upperLeft.getX(), upperLeft.getY());
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isInside(Point p) {
        return p.getX() >= upperLeft.getX() && p.getY() >= upperLeft.getY()
                && p.getX() <= (upperLeft.getX() + width)
                && p.getY() <= (upperLeft.getY() + height);
        //return upperLeft.distanceTo(p) <= width && upperLeft.distanceTo(p) <= height;
    }

    @Override
    public void move(double dx, double dy) {
        upperLeft.move(dx, dy);
    }

}
