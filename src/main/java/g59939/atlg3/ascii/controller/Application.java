package g59939.atlg3.ascii.controller;

import g59939.atlg3.ascii.model.AsciiPaint;
import g59939.atlg3.ascii.model.Shape;
import g59939.atlg3.ascii.view.AsciiView;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Application {
    private AsciiPaint paint;
    private AsciiView view;

    // J'aime bien comme tu as découpé le problème en plusieurs fonctions !
    // Par contre pour le
    public Application() {
        paint = new AsciiPaint(20, 50);
        view = new AsciiView();
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int quit = 0;
        System.out.println("--------------Welcome to ascii paint--------------");

        while (quit == 0) {
            paint.clearShapesList();
            askInputs();
            view.displayDrawing(paint.getDrawing());
            System.out.println("To Quit enter 1 to continue drawing enter 0");
            quit = scan.nextInt(); // Tu peux mettre un wrong input ici.
        }
        System.out.println("Bye...");
    }

    private void askInputs() {
        view.displayHelp();
        var pattern = Pattern.compile("add\\s[a-z]+\\s\\d+\\s\\d+\\s\\d+\\s(\\d+\\s)?[a-z]");
        String nextLine;
        String[] inputs;
        String shape = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (!(nextLine = br.readLine()).equals("show")) {
                if (!pattern.matcher(nextLine).matches()){
                    System.out.println("wrong input\nplease read & respect the instructions");
                    continue;
                }
                System.out.println(); // to clean the buffer
                inputs = nextLine.split(" ");
                shape = inputs[1];
                whichShape(shape, inputs);
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    private void whichShape(String shape, String[] inputs) {
        if (shape.equals("circle")) {
            paint.newCircle(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    inputs[5].charAt(0));
        }
        if (shape.equals("rectangle")) {
            paint.newRectangle(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    Double.parseDouble(inputs[5]),
                    inputs[6].charAt(0));
        }
        if (shape.equals("square")) {
            paint.newSquare(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Double.parseDouble(inputs[4]),
                    inputs[5].charAt(0));
        }
        if (shape.equals("line")) {
            paint.newLine(Integer.parseInt(inputs[2]),
                    Integer.parseInt(inputs[3]),
                    Integer.parseInt(inputs[4]),
                    Integer.parseInt(inputs[5]),
                    inputs[6].charAt(0));
        }
    }
}
