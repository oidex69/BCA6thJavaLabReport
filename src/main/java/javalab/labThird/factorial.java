package javalab.labThird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class factorial {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Factorial");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,100);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        jf.add(new Label("Number"));
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("Calculate");
        jf.add(tf);
        jf.add(btn);
        jf.add(new Label("Factorial"));
        JTextField rst = new JTextField(10);
        rst.setEnabled(false);
        rst.setDisabledTextColor(Color.black);
        rst.setBackground(Color.white);
        jf.add(rst);

        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int num = Integer.parseInt(tf.getText());
                    int temp = num;
                    int fac = 1;

                    for (int i = 1; i <= num; i++) {
                        fac *= temp;
                        temp--;
                    }

                    rst.setText(Integer.toString(fac));

                } catch (NumberFormatException ex) {
                    rst.setText("Please Input a valid number for result");
                }
            }
        });
    }    
}
