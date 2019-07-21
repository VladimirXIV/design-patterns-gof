package designpattern.structural.flyweight;

import java.awt.*;

public class Star extends Shape {

    private int count;

    private int innerRadius;
    private int outerRadius;

    private double xInnerCoordinates[];
    private double yInnerCoordinates[];

    private double xOuterCoordinates[];
    private double yOuterCoordinates[];

    public Star(int x, int y, int innerRadius, int outerRadius, int count) {

        super(x, y);

        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.count = count;

        this.xInnerCoordinates = new double[count];
        this.yInnerCoordinates = new double[count];

        this.xOuterCoordinates = new double[count];
        this.yOuterCoordinates = new double[count];

        calculate();
    }

    private void calculate() {

        double alpha = (2 * Math.PI)/count;

        for (int i = 0 ; i < count ; i++) {

            this.xOuterCoordinates[i] = x + outerRadius * Math.cos(i * alpha);
            this.yOuterCoordinates[i] = y + outerRadius * Math.sin(i * alpha);

            this.xInnerCoordinates[i] = x + innerRadius * Math.cos((i + 0.5) * alpha);
            this.yInnerCoordinates[i] = y + innerRadius * Math.sin((i + 0.5) * alpha);
        }
    }

    @Override
    public void draw(Graphics graphics) {

        Graphics2D g2d =(Graphics2D) graphics;

        g2d.setColor(Color.BLUE);

        for (int i = 0 ; i < count ; i++) {
            g2d.drawLine((int)xOuterCoordinates[i], (int)yOuterCoordinates[i], (int)xInnerCoordinates[i], (int)yInnerCoordinates[i]);
            if (i != 4) {
                g2d.drawLine((int)xOuterCoordinates[i+1], (int)yOuterCoordinates[i+1], (int)xInnerCoordinates[i], (int)yInnerCoordinates[i]);
            } else {
                g2d.drawLine((int)xOuterCoordinates[0], (int)yOuterCoordinates[0], (int)xInnerCoordinates[i], (int)yInnerCoordinates[i]);
            }
        }
    }
}
