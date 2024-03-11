import javax.swing.*;
import java.awt.*;

public class DrawHat extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.setColor(new Color(153,102,0));
        g.fillOval(0,height/2,width,height/2);
        g.setColor(new Color(102,51,0));
        g.fillRect(width/4,height/4,width/2,height/2);
        g.fillOval(width/4,(height*17)/32,width/2,(height*7)/16);
        g.setColor(new Color(153,102,0));
        g.fillOval(width/4,(height)/32,width/2,(height*7)/16);

    }


}
