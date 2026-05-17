package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5)); 

        add(new JLabel(" Тоо 1:"));
        txtNum1 = new JTextField();
        add(txtNum1);

        add(new JLabel(" Тоо 2:"));
        txtNum2 = new JTextField();
        add(txtNum2);

        add(new JLabel(" Үр дүн:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);

        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("*");
        btnDiv = new JButton("/");

        JPanel panelButtons = new JPanel(new GridLayout(1, 4, 5, 5));
        panelButtons.add(btnAdd);
        panelButtons.add(btnSub);
        panelButtons.add(btnMul);
        panelButtons.add(btnDiv);
        add(panelButtons);

        ActionListener listener = new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                calculate(e.getSource());
            }
        };

        btnAdd.addActionListener(listener);
        btnSub.addActionListener(listener);
        btnMul.addActionListener(listener);
        btnDiv.addActionListener(listener);
    }

    private void calculate(Object source) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            double res = 0;

            if (source == btnAdd) res = add(n1, n2);
            else if (source == btnSub) res = sub(n1, n2);
            else if (source == btnMul) res = mul(n1, n2);
            else if (source == btnDiv) {
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "0-д хувааж болохгүй!");
                    return;
                }
                res = div(n1, n2);
            }
            txtResult.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Зөвхөн тоо оруулна уу!");
        }
    }

    private double add(double a, double b) { return a + b; }
    private double sub(double a, double b) { return a - b; }
    private double mul(double a, double b) { return a * b; }
    private double div(double a, double b) { return a / b; }
}
