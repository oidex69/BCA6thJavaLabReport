package javalab.labSecond;

import javax.swing.*;
import java.awt.*;


public class gridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        gbc.gridx = 0; 
        gbc.gridy = 0;
        frame.add(b1, gbc);

        gbc.gridx = 1; 
        gbc.gridy = 0;
        frame.add(b2, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        frame.add(b3, gbc);

        frame.setVisible(true);
    }
}

