package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class armsStrong {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Reverse Number");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        jf.add(new Label("Number"));
        JTextField num = new JTextField(10);
        JButton btn = new JButton("Check");
        JLabel lb = new JLabel();
        
        jf.add(num);
        jf.add(btn);
        jf.add(lb);

        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String numTxt = num.getText().trim();
                try {
                    int num = Integer.parseInt(numTxt);
                    if (num < 0) {
                        lb.setText("Please input a non-negative integer");
                        return;
                    }

                    int power = numTxt.length();
                    int n = num;
                    int sum = 0;

                    while (n > 0) {
                        int temp = n % 10;
                        sum += (int) Math.pow(temp, power); // cast because Math.pow returns double
                        n /= 10;
                    }

                    if (sum == num) {
                        lb.setText("It is an Armstrong number");
                    } else {
                        lb.setText("It is not an Armstrong number");
                    }
                } catch (NumberFormatException ex) {
                    lb.setText("Please provide a valid number");
                }
            }
        });

    }
}
