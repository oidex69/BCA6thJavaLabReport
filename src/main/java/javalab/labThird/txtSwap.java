package javalab.labThird;

import javax.swing.*;
import java.awt.*;

public class txtSwap {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Text swap");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        JLabel lb1 = new JLabel("text one");
        JLabel lb2 = new JLabel("text two");
        JButton btn = new JButton("Swap");

        jf.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        
        jf.add(lb1);
        jf.add(lb2);
        jf.add(btn);
        jf.setVisible(true);

        btn.addActionListener(e -> {
            // Swap text both ways
            String temp = lb1.getText();
            lb1.setText(lb2.getText());
            lb2.setText(temp);
        });
    }    
}
