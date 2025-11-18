package javalab.labSecond;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);

        Panel pn = new Panel(new GridLayout(4, 2));
        
        pn.add(new Label("First Number"));
        JTextField frsNum = new JTextField();
        pn.add(frsNum);
        
        pn.add(new Label("Second Number"));

        JTextField scnNum = new JTextField();
        pn.add(scnNum);

        pn.add(new Label("Result"));
        JLabel result = new JLabel();
        pn.add(result);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

        pn.add(plus);
        pn.add(minus);

        jf.add(pn);
        jf.setVisible(true);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (frsNum.getText().isEmpty()) {
                        result.setText("Please input the first number");
                        return;
                    }
                    if (scnNum.getText().isEmpty()) {
                        result.setText("Please input the second number");
                        return;
                    }

                    int val1 = Integer.parseInt(frsNum.getText());
                    int val2 = Integer.parseInt(scnNum.getText());

                    int rst = val1 + val2;
                    result.setText("Result: " + rst);
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid integers!");
                }
            }
            
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (frsNum.getText().isEmpty()) {
                        result.setText("Please input the first number");
                        return;
                    }
                    if (scnNum.getText().isEmpty()) {
                        result.setText("Please input the second number");
                        return;
                    }

                    int val1 = Integer.parseInt(frsNum.getText());
                    int val2 = Integer.parseInt(scnNum.getText());

                    int rst = val1 - val2;
                    result.setText("Result: " + rst);
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid integers!");
                }
            }
            
        });

    }    
}
