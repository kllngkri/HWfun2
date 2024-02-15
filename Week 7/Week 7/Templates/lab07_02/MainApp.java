import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                PageSwapper app = new PageSwapper();
                app.setLocationRelativeTo(null);
                app.setVisible(true);

            }
        });

    }
}
