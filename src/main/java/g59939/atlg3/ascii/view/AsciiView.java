package g59939.atlg3.ascii.view;

import g59939.atlg3.ascii.model.Drawing;
import g59939.atlg3.ascii.model.Point;

public class AsciiView {

    public AsciiView() {

    }

    public void displayDrawing(Drawing drawing) {
        // En règle général, je préfère quand le point (0,0) est en bas à droite (i=drawing.getHeight(), i--)
        for (int i = 0; i < drawing.getHeight(); i++) {
            System.out.print("|");
            for (int j = 0; j < drawing.getWidth(); j++) {
                Point point = new Point(j, i);
                if (drawing.getShapeAt(point) != null) {
                    System.out.print(drawing.getShapeAt(point).getColor());
                } else {
                    System.out.print(" ");
                }


            }
            System.out.print("|");
            System.out.println("");
        }
    }

    public void displayHelp() {
        System.out.println("***Instructions***\n" +
                "How to paint shapes ?\n" +
                "to add shape enter (as many times as you want):\n" +
                "add circle x y radius color, or\n" +
                "add rectangle x y width height color, or\n" +
                "add square x y side color\n" +
                "max of x is 50, max of y is 20\n" +
                "to show your shapes enter 'show' and press enter");
    }
}
