package PostIt;

import javax.swing.plaf.synth.ColorType;
import java.awt.*;

public class PostIt {
  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt() {

  }

  public PostIt(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
}
