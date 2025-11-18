package javalab.labThird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textSubmit {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Field Submit");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER, 20,20));

        JTextField tf = new JTextField(15);
        JButton btn = new JButton("Submit");
        JLabel lb = new JLabel();
        
        pn.add(tf);
        pn.add(btn);
        pn.add(lb);

        jf.add(pn);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText(tf.getText());
            }
        });
    }
}
