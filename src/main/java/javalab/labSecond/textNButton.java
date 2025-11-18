package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class textNButton {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Label Demo");
        jf.setSize(600, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel name = new JLabel("Name:");
        name.setText("Full Name");
        name.setAlignmentY(JFrame.CENTER_ALIGNMENT);
        name.setAlignmentX(JFrame.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);

        JLabel address = new JLabel("Address:");
        address.setAlignmentX(JFrame.CENTER_ALIGNMENT);
        address.setAlignmentX(JFrame.CENTER_ALIGNMENT);
        JTextField addressField = new JTextField(15);

        panel.add(name); 
        panel.add(nameField);
        panel.add(address);
        panel.add(addressField);
        panel.add(new JButton("OK"));
        panel.add(new JButton("Cancel"));

        jf.add(panel);
        jf.setVisible(true);
    }
}
