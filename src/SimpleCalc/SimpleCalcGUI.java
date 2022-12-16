package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;


    public SimpleCalcGUI(){

    btnCompute.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calc();
        }
    });

        lblResult.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Calc();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public void Calc(){
        try{
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int result = 0;
            switch (cbOperations.getSelectedItem().toString()) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            lblResult.setText(String.valueOf(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(panel1,ex.toString());
        }
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setVisible(true);
        app.setSize(700, 500);
        app.setContentPane(app.panel1);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
