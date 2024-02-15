import javax.swing.*;

public class PageSwapper extends JFrame {
    private PageA pageA;
    private PageB pageB;

    public PageSwapper() {
        pageA = new PageA(this);
        pageB = new PageB(this);

        setContentPane(pageA);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void submitButtonPressed(JTextField textField) {
        pageB.submitText(textField.getText());
        setContentPane(pageB);
        revalidate();
        repaint();
    }

    public void backButtonPressed() {
        pageA.resetText();
        setContentPane(pageA);
        revalidate();
        repaint();
    }


}
