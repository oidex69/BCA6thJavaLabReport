package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class gridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 columns, gaps

        for (int i = 1; i <= 2  ; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}
