package designpattern.structural.decorator;

import java.awt.*;

public class FivePointedStar extends Shape {

    private static int pointCount = 5;

    private double xCoordinates[];
    private double yCoordinates[];


    public FivePointedStar(int x, int y, int innerRadius, int outerRadius) {

        super(x, y);

        calculate(innerRadius, outerRadius);
    }

    private void calculate(int innerRadius, int outerRadius) {

        double alpha = (2 * Math.PI)/(2 * pointCount);

        this.xCoordinates = new double[2 * pointCount];
        this.yCoordinates = new double[2 * pointCount];

        for (int i = 0 ; i < (2 * pointCount) ; i+=2) {

            this.xCoordinates[i] = x + outerRadius * Math.cos(i * alpha);
            this.yCoordinates[i] = y + outerRadius * Math.sin(i * alpha);

            this.xCoordinates[i+1] = x + outerRadius * Math.cos((i + 1) * alpha);
            this.yCoordinates[i+1] = y + outerRadius * Math.sin((i + 1) * alpha);

            System.out.println(String.format("alpha = %f, alpha = %f", i * alpha, (i + 1) * alpha));

            System.out.println(String.format("x[%d] = %f, y[%d] = %f", i, xCoordinates[i], i, yCoordinates[i]));
            System.out.println(String.format("x[%d] = %f, y[%d] = %f", i+1, xCoordinates[i+1], i + 1, yCoordinates[i+1]));
        }
    }

    @Override
    public void draw(Graphics graphics) {

        Graphics2D g2d =(Graphics2D) graphics;
        g2d.setColor(Color.BLUE);

        for (int i = 0 ; i < (6) ; i++) {
            //g2d.drawLine((int)xCoordinates[i], (int)yCoordinates[i], (int)xCoordinates[i+1], (int)yCoordinates[i+1]);
            g2d.drawOval((int)xCoordinates[i], (int)yCoordinates[i], 5, 5);
        }
    }

    @Override
    public double[] getXCoordinates() {
        return this.xCoordinates;
    }

    @Override
    public double[] getYCoordinates() {
        return this.yCoordinates;
    }
}
