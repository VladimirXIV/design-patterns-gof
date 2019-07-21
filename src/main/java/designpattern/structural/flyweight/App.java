package designpattern.structural.flyweight;

import javax.swing.*;

public class App {

    public  static  void main(String ar[]) {

        JFrame drawFrame = new JFrame();
        drawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        drawFrame.setSize(888, 300);

        DrawFrame jPanel = new DrawFrame(888, 888);
        drawFrame.add(jPanel);
        drawFrame.setVisible(true);

        jPanel.addShape(new Star(20, 20, 20, 20, 10));
 }

}
