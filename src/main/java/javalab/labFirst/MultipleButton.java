package javalab.labFirst;

import javax.swing.*;
import java.awt.*;

public class MultipleButton {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hi");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 400);

        // FlowLayout arranges components in a row
        jf.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        jf.add(new JButton("Apple"));
        jf.add(new JButton("Orange"));
        jf.add(new JButton("Guava"));

        jf.setVisible(true);
    }
}
