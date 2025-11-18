package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class flowLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("flow layout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        jf.add(new JButton("One"));
        jf.add(new JButton("Two"));

        jf.setVisible(true);
    }
}
