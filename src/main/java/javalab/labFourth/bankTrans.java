package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bankTrans {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Bank Transfering System");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new GridLayout(4,1));
        
        Panel title = new Panel(new FlowLayout(FlowLayout.CENTER,0,40));
        title.add(new Label("Choose your Payment"));

        Panel items = new Panel(new GridLayout(2,2));
        JRadioButton crcd = new JRadioButton("Credit Card");
        JRadioButton wall = new JRadioButton("Wallet");
        JRadioButton tran = new JRadioButton("Bank Transfer");
        JRadioButton deli = new JRadioButton("Cash on Delivery");

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(crcd);
        paymentGroup.add(wall);
        paymentGroup.add(tran);
        paymentGroup.add(deli);

        items.add(crcd);
        items.add(wall);
        items.add(tran);
        items.add(deli);

        JButton btn = new JButton("Submit");
        btn.setPreferredSize(new Dimension(200,40));
        Panel btnPn = new Panel(new FlowLayout(FlowLayout.LEFT));
        btnPn.add(btn);
        JLabel lb = new JLabel();

        jf.add(title);
        jf.add(items);
        jf.add(btnPn);
        jf.add(lb);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JRadioButton[] box = { crcd, wall, tran, deli };
                String selected = "";

                for (JRadioButton sel : box) {
                    if (sel.isSelected()) {
                        selected = sel.getText();
                    }
                }

                lb.setText("You have selected "+ selected);
            }
        });
    }
}
