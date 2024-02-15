import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PageB extends JPanel {
    private JTextArea textArea;
    private  PageSwapper pageSwapper;

    public PageB(PageSwapper parent) {
        this.pageSwapper = parent;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        textArea = new JTextArea("");
        JButton backButton = new JButton("Back");

        textArea.setEditable(false);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(textArea);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pageSwapper.backButtonPressed();
            }
        });
    }

    public void submitText(String text) {
        String currentText = this.textArea.getText();
        textArea.setText(currentText + " " + text);
    }
}
