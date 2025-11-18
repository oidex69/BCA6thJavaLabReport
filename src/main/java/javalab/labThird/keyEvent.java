package javalab.labThird;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Key Event");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        jf.add(new Label("enter text"));
        JTextField tf = new JTextField(15);
        JLabel lb = new JLabel();

        jf.add(tf);
        jf.add(lb);
        jf.setVisible(true);

        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                lb.setText(tf.getText());
            }
        });
    }
}
