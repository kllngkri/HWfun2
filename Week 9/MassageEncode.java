import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

public class MassageEncode extends JPanel {

    public MassageEncode(){
        setLayout(new GridLayout(3,1));
        JPanel inputMessage = new JPanel(new GridLayout(1,2));
        JTextField textField = new JTextField();
        inputMessage.setBorder(BorderFactory.createEmptyBorder(20,20,5,5));
        inputMessage.setSize(200,150);
        inputMessage.add(new JLabel("Original message : "));
        inputMessage.add(textField);
        add(inputMessage);

        JPanel encodeBut = new JPanel();
        encodeBut.setBorder(BorderFactory.createEmptyBorder(20,5,20,5));
        JButton button = new JButton("Encode");
        button.setPreferredSize(new Dimension(80, 40));
        encodeBut.add(button);
        add(encodeBut);

        JPanel showResult = new JPanel();
        showResult.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
        JLabel messageEncode = new JLabel();
        showResult.add(messageEncode);

        add(showResult);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageEncode.setText(encodeMessage(textField.getText()));
                System.out.print("Original message : ");
                System.out.printf(textField.getText()+"\n");
                System.out.print("Encode Message : ");
                System.out.print(encodeMessage(textField.getText()));
            }
        });


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Message Encode");

                frame.add(new MassageEncode());
                frame.setSize(350,300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

    }

    public static String encodeMessage(String originalMessage){
        String encodeMessage = "";

        for (int i = 0;i < originalMessage.length();i++){
            String currentMessage = encodeMessage;

            int encodeChar = (int)'z' - ((int)originalMessage.charAt(i) - (int)'a');
            if (originalMessage.charAt(i) >= 'a' || originalMessage.charAt(i) <= 'z'){
                encodeMessage = currentMessage + (char)encodeChar;

            }else {
                encodeMessage = currentMessage + (char)encodeChar;
            }

        }

        return  encodeMessage;
    }


}
