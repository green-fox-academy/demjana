import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics) {
    System.out.println("Enter a number:");
    Scanner scanner = new Scanner(System.in);
    int times = scanner.nextInt();

    Color[] colorArray = {Color.red, Color.orange, Color.yellow, Color.green,
            Color.blue, new Color(29, 0, 51), new Color(238, 130, 238)};

    for (int i = 0; i < times; i++) {
        drawCenteredRectangles(320 / times * (times - i), colorArray[(times - i) % 7], graphics);
    }
  }

  private static void drawCenteredRectangles(int size, Color color, Graphics graphics) {
    graphics.setColor(color);
    graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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