package javalab.labThird;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class color {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Choose a color");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,400);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
        
        JButton red = new JButton("Red");
        JButton grn = new JButton("green");
        JButton blu = new JButton("blue");
        JButton cls = new JButton("close");

        pn.add(red);
        pn.add(grn);
        pn.add(blu);
        pn.add(cls);
        pn.setBackground(Color.RED);

        jf.add(pn);
        jf.setVisible(true);

        red.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn.setBackground(Color.RED);
            }
        });
        grn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn.setBackground(Color.GREEN);
            }
        });
        blu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn.setBackground(Color.BLUE);
            }
        });
        cls.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

    }    
}
