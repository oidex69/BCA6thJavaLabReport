package javalab.labThird;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class countAndReset {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Counter");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,100);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));

        pn.add(new Label("Count"));

        JTextField tf = new JTextField(15);
        JButton up = new JButton("Up");
        JButton dwn = new JButton("Down");
        JButton rst = new JButton("Reset");
        JLabel lb = new JLabel();

        pn.add(tf);
        pn.add(up);
        pn.add(dwn);
        pn.add(rst);
        pn.add(lb);

        jf.add(pn);
        jf.setVisible(true);

        up.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count;
                try {
                    count = Integer.parseInt(tf.getText());
                } catch (NumberFormatException ex) {
                    lb.setText("Please input a valid number");
                    return;
                }
                if(count > 0) {
                    count++;
                    tf.setText(Integer.toString(count));
                }
                
            }
        });
        dwn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count;
                try {
                    count = Integer.parseInt(tf.getText());
                } catch (NumberFormatException ex) {
                    lb.setText("Please input a valid number");
                    return;
                }
                if(count > 0) {
                    count--;
                    tf.setText(Integer.toString(count));
                }
                
            }
        });
        rst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf.setText("");
            }
        });
    }    
}
