import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageA extends JPanel {
    private PageSwapper pageSwapper;
    JTextField textField;
    public PageA(PageSwapper parent) {
        this.pageSwapper = parent;
        this.textField = new JTextField(20);
        JButton submitButton = new JButton("Submit");


        add(textField);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pageSwapper.submitButtonPressed(textField);
            }
        });
    }

    public void resetText(){
        textField.setText(null);
    }
}
