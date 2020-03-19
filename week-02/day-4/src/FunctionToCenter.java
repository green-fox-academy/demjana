import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < 16; i++) {
      lineDraw(x, y, graphics);
      x += 20;
    }
    for (int i = 0; i < 16; i++) {
      lineDraw(x, y, graphics);
      y += 20;
    }
    for (int i = 0; i < 16; i++) {
      lineDraw(x, y, graphics);
      x -= 20;
    }
    for (int i = 0; i < 16; i++) {
      lineDraw(x, y, graphics);
      y -= 20;
    }
  }

  private static void lineDraw(int x, int y, Graphics graphics) {
    graphics.setColor(new Color(0, 0, 0, 255));
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);

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