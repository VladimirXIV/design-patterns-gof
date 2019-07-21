package designpattern.structural.decorator;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/* decorator */
public class EUFlag extends Shape {

    private Shape shape;

    private int radius;
    private int count;


    public EUFlag(int x, int y) {
        super(x, y);
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }


    private void calculate() {

    }

    @Override
    public void draw(Graphics graphics) {

        shape.draw(graphics);
    }

    @Override
    public double[] getXCoordinates() {
        return new double[0];
    }

    @Override
    public double[] getYCoordinates() {
        return new double[0];
    }
}
