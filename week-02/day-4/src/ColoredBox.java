import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics){
        Color red = new Color(255,0,0);
        graphics.setColor(red);
        graphics.drawLine(WIDTH/4,HEIGHT/4,WIDTH/4*3,HEIGHT/4);

        Color yellow = new Color(255,255,0);
        graphics.setColor(yellow);
        graphics.drawLine(WIDTH/4*3,HEIGHT/4,WIDTH/4*3,HEIGHT/4*3);

        Color green = new Color(0,255,0);
        graphics.setColor(green);
        graphics.drawLine(WIDTH/4,HEIGHT/4*3,WIDTH/4*3,HEIGHT/4*3);

        Color purple = new Color(255,0,255);
        graphics.setColor(purple);
        graphics.drawLine(WIDTH/4,HEIGHT/4,WIDTH/4,HEIGHT/4*3);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}