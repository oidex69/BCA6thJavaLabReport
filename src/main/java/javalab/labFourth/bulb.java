package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bulb {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Light");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER));

        Panel pn = new Panel();
        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));

        Panel btnPn = new Panel(new FlowLayout(FlowLayout.CENTER));
        JButton btn = new JButton("On");

        btnPn.add(btn);
        pn.add(btnPn);
        jf.add(pn);

        ImageIcon rawIcon = new ImageIcon(
                imageIcon.class.getClassLoader().getResource("image/bulb/bulboff.jpg")
        );
        int newWidth = 250;
        int newHeight = 300;

        Image scaledImg = rawIcon.getImage().getScaledInstance(
                newWidth, newHeight, Image.SCALE_SMOOTH
        );

        ImageIcon icon = new ImageIcon(scaledImg);
        JLabel lb = new JLabel(icon);
        
        pn.add(lb);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn.getText().equals("On")) {
                    ImageIcon rawIcon = new ImageIcon(
                            imageIcon.class.getClassLoader().getResource("image/bulb/bulbon.png")
                    );
                    int newWidth = 250;
                    int newHeight = 300;

                    Image scaledImg = rawIcon.getImage().getScaledInstance(
                            newWidth, newHeight, Image.SCALE_SMOOTH
                    );

                    ImageIcon icon = new ImageIcon(scaledImg);
                    lb.setIcon(icon);
                    btn.setText("Off");
                }else {
                    ImageIcon rawIcon = new ImageIcon(
                            imageIcon.class.getClassLoader().getResource("image/bulb/bulboff.jpg")
                    );
                    int newWidth = 250;
                    int newHeight = 300;

                    Image scaledImg = rawIcon.getImage().getScaledInstance(
                            newWidth, newHeight, Image.SCALE_SMOOTH
                    );

                    ImageIcon icon = new ImageIcon(scaledImg);
                    lb.setIcon(icon);
                    btn.setText("On");
                }
            }
        });

    }
}
