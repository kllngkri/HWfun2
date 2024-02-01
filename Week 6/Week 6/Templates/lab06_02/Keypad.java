import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Keypad extends JFrame {
    public Keypad() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JTextField text = new JTextField("0");
        mainPanel.add(text, BorderLayout.NORTH);

        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(3, 3));

        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = text.getText();
                if (currentText.equals("0"))
                    text.setText("7");
                else
                    text.setText(currentText + "7");
            }
        });
        keypad.add(button7);

        JButton button8 = new JButton("8");
        setNum(button8,text,"8");
        keypad.add(button8);
        JButton button9 = new JButton("9");
        setNum(button9,text,"9");
        keypad.add(button9);
        JButton button4 = new JButton("4");
        setNum(button4,text,"4");
        keypad.add(button4);
        JButton button5 = new JButton("5");
        setNum(button5,text,"5");
        keypad.add(button5);
        JButton button6 = new JButton("6");
        setNum(button6,text,"6");
        keypad.add(button6);
        JButton button1 = new JButton("1");
        setNum(button1,text,"1");
        keypad.add(button1);
        JButton button2 = new JButton("2");
        setNum(button2,text,"2");
        keypad.add(button2);
        JButton button3 = new JButton("3");
        setNum(button3,text,"3");
        keypad.add(button3);


        JPanel allKeys = new JPanel();
        allKeys.add(keypad);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               text.setText("0");
            }
        });
        allKeys.add(clearButton);

        mainPanel.add(allKeys, BorderLayout.CENTER);

        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void setNum(JButton buttons,JTextField text,String num){
        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = text.getText();
                if (currentText.equals("0"))
                    text.setText(num);
                else
                    text.setText(currentText + num);
            }
        });
    }

    public static void main(String[] args) {
        Keypad app = new Keypad();
        app.setVisible(true);
    }
}