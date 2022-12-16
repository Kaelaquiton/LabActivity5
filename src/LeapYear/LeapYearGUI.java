package LeapYear;

import javax.swing.*;
import java.awt.event.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel yearLabel;

    public LeapYearGUI(String title){
    super(title);

    btnCheckYear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int year = Integer.parseInt(tfYear.getText());
                boolean isLeapYear = false;
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else if (year % 100 == 0) {
                    isLeapYear = false;
                } else if (year % 4 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }

                if (isLeapYear) {
                    JOptionPane.showMessageDialog(panel1, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(panel1, "Not a leap year");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(panel1, ex.toString());
            }
        }
    });

}

    public static void main(String[] args){
        JFrame frame = new LeapYearGUI("Leap Year Checker");
        frame.setVisible(true);
        frame.setSize(300,400);
        frame.setContentPane(((LeapYearGUI) frame).panel1);
    }
}
