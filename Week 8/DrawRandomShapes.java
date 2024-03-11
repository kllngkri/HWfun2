import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawRandomShapes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();


        for(int i = 0;i < 3;i++) {

            int shapes = random.nextInt(2);
            if (shapes == 1) {
                g.setColor(Color.PINK);
                g.fillRect(random.nextInt(300), random.nextInt(300), random.nextInt(100,300), random.nextInt(100,300));
            } else {
                g.setColor(Color.blue);
                g.drawLine(random.nextInt(150), random.nextInt(150), random.nextInt(150,300), random.nextInt(150,300));
            }
        }


    }
}
