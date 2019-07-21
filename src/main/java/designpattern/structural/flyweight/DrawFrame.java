package designpattern.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawFrame extends JPanel {

    private final int width;
    private final int height;

    private List<Shape> shapes = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawShapes(g);
    }

    public DrawFrame(int width, int height) {

        this.width = width;
        this.height = height;

        setSize(this.width, this.height);
        setLayout(null);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    private void drawShapes(Graphics g) {
        for(Shape shape : shapes) {
            shape.draw(g);
        }
    }
}