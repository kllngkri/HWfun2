import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SimpleBankApp {
    public static void main(String[] args) {
        JFrame app = new JFrame();

        app.add(new JLabel("Simple Bank App", SwingConstants.CENTER), BorderLayout.PAGE_START);

        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(5, 2));
        dataEntryPanel.add(new JLabel("Account Number"));
        dataEntryPanel.add(new JLabel("1234-0001"));
        dataEntryPanel.add(new JLabel("Status"));
        dataEntryPanel.add(new JLabel("Active"));
        dataEntryPanel.add(new JLabel("Balance"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Amount"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Operation"));

        JPanel operationPanel = new JPanel();
        operationPanel.setLayout(new BoxLayout(operationPanel, BoxLayout.X_AXIS));

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");


        operationPanel.add(depositButton);
        operationPanel.add(withdrawButton);

        dataEntryPanel.add(operationPanel, BorderLayout.EAST);

        app.add(dataEntryPanel, BorderLayout.CENTER);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400, 200);
        app.setVisible(true);
    }
}
