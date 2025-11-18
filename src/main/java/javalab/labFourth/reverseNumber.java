package javalab.labFourth;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class reverseNumber {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Reverse Number");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new GridLayout(2,1));

        Panel numPn = new Panel(new GridLayout(2,2));
        numPn.add(new Label("Number"));
        JTextField num = new JTextField();
        numPn.add(num);
        numPn.add(new Label("Prime"));
        JTextField rev = new JTextField();
        rev.setEnabled(false);
        rev.setDisabledTextColor(Color.BLACK);
        numPn.add(rev);

        JButton btn = new JButton("Reverse");

        jf.add(numPn);
        jf.add(btn);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String numb = num.getText().trim();
                try {
                    int n = Integer.parseInt(numb);
                    int sign = (n < 0) ? -1 : 1;
                    n = Math.abs(n);

                    int revNum = 0; // use long during accumulation to detect overflow
                    while (n > 0) {
                        int digit = n % 10;
                        revNum = revNum * 10 + digit;
                        n /= 10;
                    }

                    revNum *= sign;

                    // clamp back to int, report overflow if needed
                    if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
                        rev.setText("Overflow");
                    } else {
                        rev.setText(String.valueOf((int) revNum));
                    }
                } catch (NumberFormatException ex) {
                    rev.setText("Please input a valid integer");
                }
            }
        });
    }
}
