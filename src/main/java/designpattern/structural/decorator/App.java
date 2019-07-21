package designpattern.structural.decorator;

import javax.swing.*;

public class App {

    public  static  void main(String ar[]) {

        JFrame drawFrame = new JFrame();
        drawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        drawFrame.setSize(500, 500);

        DrawFrame jPanel = new DrawFrame(888, 888);
        drawFrame.add(jPanel);
        drawFrame.setVisible(true);


        Shape fps = new FivePointedStar(200, 200, 40, 90);

        EUFlag euf = new EUFlag(200, 200);
        euf.setShape(fps);

        jPanel.addShape(euf);
    }

}
