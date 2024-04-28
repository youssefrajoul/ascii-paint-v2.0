package g59939.atlg3.ascii.model;

import java.util.*;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(Point other){
        return Math.sqrt( Math.pow((other.getY() - this.getY()),2) + Math.pow((other.getX() - this.getX()),2));
    }
}