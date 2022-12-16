package LeapYear;

import javax.swing.*;
import java.awt.event.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Checker();
            }
        });

        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Checker();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public void Checker(){
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

    public static void main(String[] args){
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(500,300);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
