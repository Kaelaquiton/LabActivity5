package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){
    btnOrder.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Order();
        }
    });
    }

    public void Order(){
        try {
            double result = 0;
            double discount;
            if (cPizza.isSelected()) {
                result += 100;
            }
            if (cBurger.isSelected()) {
                result += 80;
            }
            if (cFries.isSelected()) {
                result += 65;
            }
            if (cSoftDrinks.isSelected()) {
                result += 55;
            }
            if (cTea.isSelected()) {
                result += 50;
            }
            if (cSundae.isSelected()) {
                result += 40;
            }
            if (rb5.isSelected()) {
                discount = (result * 0.05);
                result -= discount;
            } else if (rb10.isSelected()) {
                discount = (result * 0.10);
                result -= discount;
            } else if (rb15.isSelected()) {
                discount = result * 0.15;
                result -= discount;
            }
            JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f ", result));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(panel1,ex.toString());
        }
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(700,700);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
