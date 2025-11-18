package javalab.labSecond;

import javax.swing.*;

public class boxLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // vertical

        panel.add(new JButton("Button 1"));
        panel.add(Box.createVerticalStrut(10)); // spacing
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 3"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
