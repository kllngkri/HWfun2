import javax.swing.*;

public class DrawHatTest {
    public static void main(String[] args) {
        DrawHat panel = new DrawHat();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
