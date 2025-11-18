package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class FourButtonWithLabel {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Demo");
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel pn = new Panel(new GridLayout(2,2));
        
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");

        two.setEnabled(false);
        four.setEnabled(false);

        one.setLabel("One");
        three.setLabel("Three");

        pn.add(one);
        pn.add(two);
        pn.add(three);
        pn.add(four);

        jf.add(pn);
        jf.setVisible(true);

    }    
}
