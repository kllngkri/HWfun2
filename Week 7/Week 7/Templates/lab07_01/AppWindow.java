import java.awt.*;

import javax.swing.*;

public class AppWindow extends JFrame {
    public AppWindow() {
        JPanel panelAll = new JPanel();
        panelAll.setLayout(new BorderLayout(10,10));


        JButton buttonA = new JButton("Button A");
        JButton buttonB = new JButton("Button B");
        JButton buttonC = new JButton("Button C");
        JButton buttonD = new JButton("Button D");
        JButton buttonE = new JButton("Button E");

        JTextField textA = new JTextField(15);
        JTextField textB = new JTextField(15);

        textA.setMaximumSize(new Dimension(Short.MAX_VALUE, 20));

        JLabel labelA = new JLabel("Label A");
        JLabel labelB = new JLabel("Label B");
        JLabel labelC = new JLabel("Label C");

        Insets panelInsets = new Insets(10, 10, 10, 10);
        panelAll.setBorder(BorderFactory.createEmptyBorder(10, 10, -1, 10));

        Container container = new Container();
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(labelA);
        container.add(textA);
        container.add(buttonA);
        container.add(Box.createVerticalStrut(70));
        container.add(buttonB);
        panelAll.add(container,BorderLayout.WEST);

        JPanel panelB = new JPanel();
        panelB.setLayout(new BoxLayout(panelB,BoxLayout.Y_AXIS));
        panelB.add(labelC,BorderLayout.CENTER);
        panelB.add(buttonC);
        panelB.add(Box.createVerticalStrut(20));
        panelB.add(buttonD);
        panelB.add(textB);
        panelB.add(Box.createVerticalStrut(110));
        panelAll.add(panelB,BorderLayout.EAST);


        JPanel boxButtonE = new JPanel();
        boxButtonE.add(buttonE,BorderLayout.CENTER);
        panelAll.add(boxButtonE,BorderLayout.PAGE_END);



        add(panelAll, BorderLayout.CENTER);



        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
