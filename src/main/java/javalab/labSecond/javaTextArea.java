package javalab.labSecond;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class javaTextArea {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Java TextArea");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        Panel mainpn = new Panel(new GridLayout(2,1));

        Panel ctrPn = new Panel(new FlowLayout(FlowLayout.CENTER,0,60));

        JLabel lb = new JLabel();
        ctrPn.add(new Label("Control in action: "));
        ctrPn.add(lb);

        Panel comPanel = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));
        comPanel.add(new Label("Comments: "));
        TextArea area = new TextArea("We are demonstrating TextArea",5,40);
        JButton btn = new JButton("Show");

        comPanel.add(area);
        comPanel.add(btn);

        mainpn.add(ctrPn);
        mainpn.add(comPanel);

        jf.add(mainpn);
        jf.setVisible(true);

        area.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("Text Area");
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb.setText("Button");
            }            
        });
        
    }
}
