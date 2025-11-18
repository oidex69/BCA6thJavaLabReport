package javalab.labFourth;

import javax.swing.*;
import java.awt.*;

public class imageIcon {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame jf = new JFrame("Image Icon Class");
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));

            // Title
            JLabel title = new JLabel("Java Programming");
            content.add(title);

            // Load icon
            ImageIcon rawIcon = new ImageIcon(
                    imageIcon.class.getClassLoader().getResource("image/Java-Logo.png")
            );

            // Scale the image (set size you want)
            int newWidth = 400;
            int newHeight = 250;

            Image scaledImg = rawIcon.getImage().getScaledInstance(
                    newWidth, newHeight, Image.SCALE_SMOOTH
            );

            ImageIcon icon = new ImageIcon(scaledImg);
            JLabel lb = new JLabel(icon);

            content.add(lb);

            // Subtitle
            JLabel sub = new JLabel("Try it");
            content.add(sub);

            jf.setContentPane(content);
            jf.setSize(350, 480);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
        });
    }
}
