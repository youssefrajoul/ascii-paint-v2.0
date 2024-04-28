package g59939.atlg3.ascii.model;

public abstract class ColoredShape implements Shape {
    private char color;

    public ColoredShape(char color) {
        this.color = color;
    }

    @Override
    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
