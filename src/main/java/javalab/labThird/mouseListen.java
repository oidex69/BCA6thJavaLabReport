package javalab.labThird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseListen {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Java MouseEvent");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new GridLayout(3, 1, 20, 20));

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(new Label("MouseListener"));
        System.out.println("hello world");
        jf.add(p1);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField tf = new JTextField(15);
        tf.setEnabled(false);
        tf.setBackground(Color.BLUE);
        p2.add(tf);
        jf.add(p2);

        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lb = new JLabel("Perform a mouse action...");
        p3.add(lb);
        jf.add(p3);

        tf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("Mouse Clicked:("+e.getX()+","+e.getY()+")");
            }
        });

        jf.setVisible(true);
    }
}
