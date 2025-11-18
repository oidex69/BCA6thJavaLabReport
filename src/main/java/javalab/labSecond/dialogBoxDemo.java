package javalab.labSecond;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class dialogBoxDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Dialog Box");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);
        jf.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        JButton messBtn = new JButton("Show Message");
        JButton fileBtn = new JButton("Open File");

        jf.add(messBtn);
        jf.add(fileBtn);
        jf.setVisible(true);

        messBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Hello, this is a message dialog!");
            }
        });

        fileBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(jf);

                if (option == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(jf,
                            "File to save: " + fileToSave.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(jf, "Save cancelled");
                }
            }
        });


    }
}
