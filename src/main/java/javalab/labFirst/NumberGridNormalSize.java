package javalab.labFirst;

import javax.swing.*;
import java.awt.*;

public class NumberGridNormalSize {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hi");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);

        // Use GridBagLayout for more control
        jf.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between buttons

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");

        // Row 0, Column 0
        gbc.gridx = 0;
        gbc.gridy = 0;
        jf.add(b1, gbc);

        // Row 0, Column 1
        gbc.gridx = 1;
        gbc.gridy = 0;
        jf.add(b2, gbc);

        // Row 1, Column 0
        gbc.gridx = 0;
        gbc.gridy = 1;
        jf.add(b3, gbc);

        // Row 1, Column 1
        gbc.gridx = 1;
        gbc.gridy = 1;
        jf.add(b4, gbc);

        jf.setVisible(true);
    }
}
