import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdderAndSubtractor extends JFrame {
    enum Status {ADDER,SUBTRACT}
    private static Status status = null;
    private static Status checkStatus;
    private static int num1 = 0;
    private static int num2 = 0;

    private static int result = 0;


    public AdderAndSubtractor() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JTextField text = new JTextField("0");
        mainPanel.add(text, BorderLayout.NORTH);

        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 3));


        JButton button7 = new JButton("7");
        setNum(button7,text,"7");
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
        JButton button0 = new JButton("0");
        setNum(button0,text,"0");
        keypad.add(button0);



        JPanel allKeys = new JPanel();
        allKeys.add(keypad);
        JPanel operatorButton = new JPanel();
        operatorButton.setLayout(new GridLayout(4,1));

        JButton subTracButton = new JButton("-");
        subTracButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkStatus = Status.SUBTRACT;
                if (status == null){
                    status = Status.SUBTRACT;
                    num1 = Integer.parseInt(text.getText());
                }else {
                    status = Status.SUBTRACT;
                    num2 = Integer.parseInt(text.getText());
                }
                System.out.println("Status = Subtract");
            }
        });
        operatorButton.add(subTracButton);

        JButton adderButton = new JButton("+");
        adderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkStatus = Status.ADDER;
                if (status == null){
                    status = Status.ADDER;
                    num1 = Integer.parseInt(text.getText());
                }else {
                    status = Status.ADDER;
                    num2 = Integer.parseInt(text.getText());
                }

                System.out.println("Status = Adder");
            }
        });
        operatorButton.add(adderButton);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation(text);
            }
        });
        operatorButton.add(equalButton);
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                status = null;
                checkStatus = null;
                num1 = 0;
                num2 = 0;
                result = 0;
                text.setText("0");
            }
        });
        operatorButton.add(clearButton);
        allKeys.add(operatorButton);


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
                else if (checkStatus != null) {
                    currentText = null;
                    text.setText(num);
                    checkStatus = null;
                }else
                    text.setText(currentText + num);
            }
        });
    }

    //operation method
    private static void operation(JTextField text){
        if (status == Status.ADDER){
            result = num1+Integer.parseInt(text.getText());
            text.setText(Integer.toString(result));
            num1 = result;
        }else if (status == Status.SUBTRACT){
            result = num1 - Integer.parseInt(text.getText());
            text.setText(Integer.toString(result));
            num1 = result;
        }
    }




    public static void main(String[] args) {
        AdderAndSubtractor app = new AdderAndSubtractor();
        app.setVisible(true);
    }


}