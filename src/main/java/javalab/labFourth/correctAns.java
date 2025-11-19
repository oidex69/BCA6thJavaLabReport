package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class correctAns {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Guess the Correct Answer");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new GridLayout(3,1));
        
        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,0,50));
        pn.add(new Label("Who is the Founder of java"));

        jf.add(pn);

        Panel choice = new Panel(new GridLayout(2,2));
        JButton ch1 = new JButton("Denish Richle");
        JButton ch2 = new JButton("James Gosalin");
        JButton ch3 = new JButton("Gaido Van Rossum");
        JButton ch4 = new JButton("Patrik Naughtom");

        choice.add(ch1);
        choice.add(ch2);
        choice.add(ch3);
        choice.add(ch4);

        jf.add(choice);

        Panel res = new Panel(new FlowLayout(FlowLayout.CENTER,0,30));
        Label lb = new Label("                       ");
        res.add(lb);

        jf.add(res);

        jf.setVisible(true);

        ch2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("You are correct");
            }
        });
        ch1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("You are incorrect");
            }
        });
        ch3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("You are incorrect");
            }
        });
        ch4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("You are incorrect");
            }
        });
    }
}
