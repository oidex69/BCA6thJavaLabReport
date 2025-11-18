package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class largestNum {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Largest Number");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(350,250);

        JPanel pn = new JPanel(new FlowLayout(FlowLayout.CENTER,10, 10));

        pn.add(new Label("Find the Largest One"));

        JPanel fstPn = new JPanel(new GridLayout(1, 2));
        fstPn.add(new JLabel("First Number: "));

        JTextField num1 = new JTextField(15);
        fstPn.add(num1);
                
        JPanel scnPn = new JPanel(new GridLayout(1,2));
        scnPn.add(new JLabel("Second Number: "));

        JTextField num2 = new JTextField(15);
        scnPn.add(num2);

        pn.add(fstPn);
        pn.add(scnPn);
        
        JButton btn = new JButton("Check");
        JLabel lb = new JLabel();
        pn.add(btn);
        pn.add(lb);

        jf.add(pn);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());

                    if (n1 > n2) {
                        lb.setText(n1 + "is the largest number");
                    } else if (n2 > n1) {
                        lb.setText(n2 + "is the largest number");
                    } else {
                        lb.setText("Both are same");
                    }

                } catch (NumberFormatException ex) {
                    lb.setText("Please provide a valid number");
                }
            }
        });
    }    
}
