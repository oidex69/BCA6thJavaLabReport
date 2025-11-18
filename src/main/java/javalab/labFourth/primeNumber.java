package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class primeNumber {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);

        jf.setLayout(new GridLayout(2,1));

        Panel numPn = new Panel(new GridLayout(2,2));
        numPn.add(new Label("Number"));
        JTextField num = new JTextField();
        numPn.add(num);
        numPn.add(new Label("Prime"));
        JTextField prime = new JTextField();
        prime.setEnabled(false);
        prime.setDisabledTextColor(Color.BLACK);
        numPn.add(prime);

        JButton btn = new JButton("Check");

        jf.add(numPn);
        jf.add(btn);
        jf.setVisible(true);
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numb;
                try {
                    numb = Integer.parseInt(num.getText());
                    if (numb <= 1) {
                        prime.setText("No"); // 0, 1, and negatives are not prime
                        return;
                    }
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(numb); i++) {
                        if (numb % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    prime.setText(isPrime ? "Yes" : "No");

                } catch (NumberFormatException ex) {
                    prime.setText("Please Input a valid number");
                }
            }
        });

    }
}
