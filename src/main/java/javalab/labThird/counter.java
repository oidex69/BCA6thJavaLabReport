package javalab.labThird;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class counter {
    public static void main(String[] args) {
        JFrame jf = new JFrame("AWT Counter");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,200);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER, 5,20));

        pn.add(new Label("Enter an integer"));
        JTextField txt = new JTextField(15);
        JButton btn = new JButton("Count Down");
        pn.add(txt);
        pn.add(btn);

        jf.add(pn);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = Integer.parseInt(txt.getText());
                if (count > 0) {
                    count--;
                    txt.setText(Integer.toString(count));
                }
            }
        });

    }
}
