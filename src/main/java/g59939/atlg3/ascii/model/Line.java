package g59939.atlg3.ascii.model;

import java.awt.*;

public class Line extends ColoredShape {

    private Point a;
    private Point b;

    public Line(Point a, Point b, char color){
        super(color);
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    private double getCoeffDirecteur() {
        try {
            return (b.getY() - a.getY()) / (b.getX() - a.getX());
        } catch (Exception e){
            return 0;
        }
    }


    public double distanceToLine(Point c) {
        if (getCoeffDirecteur() != 0){
            return Math.abs((getCoeffDirecteur() * c.getX()) - c.getY() - (getCoeffDirecteur() * a.getX()) + a.getY()) /
                    Math.sqrt(Math.pow(getCoeffDirecteur(), 2) + 1);
        }
        return getA().getX() - c.getX();
    }

    @Override
    public boolean isInside(Point p) {
        return distanceToLine(p) == 0;
    }

    @Override
    public void move(double dx, double dy) {
        // move a and b

    }
}
