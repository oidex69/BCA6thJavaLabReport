package javalab.labFirst;

import javax.swing.*;
import java.awt.*;

public class HelloButton extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button create");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 400);

        // Use FlowLayout aligned to the LEFT
        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JButton but = new JButton("Hello");
        jf.add(but);

        jf.setVisible(true);
    }
}
