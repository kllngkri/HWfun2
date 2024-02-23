import javax.swing.*;

public class DrawRandomShapesTest {
    public static void main(String[] args) {
        DrawRandomShapes panel = new DrawRandomShapes();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}
