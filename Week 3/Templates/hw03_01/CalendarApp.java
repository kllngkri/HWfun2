import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class CalendarApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calendar App");
            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new BorderLayout());

            JPanel calendarPanel = new JPanel(new GridLayout(0, 7));
            addDayLabels(calendarPanel);

            Calendar calendar = Calendar.getInstance();
            calendar.set(2024, Calendar.JANUARY, 1);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            for (int i = 1; i < dayOfWeek; i++) {
                calendarPanel.add(new JLabel(""));
            }

            for (int day = 1; day <= maxDayOfMonth; day++) {
                JButton dayButton = new JButton(Integer.toString(day));
                calendarPanel.add(dayButton);
            }

            calendarPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10)); // Adjust the spacing

            JPanel endPanel = new JPanel();
            JPanel buttonPanel = new JPanel(new BorderLayout());
            JButton btn1 = new JButton(">>");
            JButton btn2 = new JButton("<<");
            buttonPanel.add(btn2, BorderLayout.CENTER);
            buttonPanel.add(btn1, BorderLayout.CENTER);
            buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.X_AXIS));
            endPanel.add(buttonPanel);
            endPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

            mainPanel.add(calendarPanel, BorderLayout.CENTER);
            mainPanel.add(endPanel, BorderLayout.PAGE_END);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }

    private static void addDayLabels(JPanel calendarPanel) {
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            calendarPanel.add(label);
        }
    }
}
