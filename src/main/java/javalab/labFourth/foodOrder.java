package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class foodOrder {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Food Ordering System");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        jf.setLayout(new GridLayout(4,1));
        
        Panel title = new Panel(new FlowLayout(FlowLayout.CENTER,0,40));
        title.add(new Label("Food Ordering System"));

        Panel items = new Panel(new GridLayout(2,2));
        JCheckBox momo = new JCheckBox("Momo");
        JCheckBox piz = new JCheckBox("Pizza");
        JCheckBox chow = new JCheckBox("Chowmin");
        JCheckBox ric = new JCheckBox("Fry Rice");

        items.add(momo);
        items.add(piz);
        items.add(chow);
        items.add(ric);

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
                JCheckBox[] box = { momo, piz, chow, ric };
                List<String> selected = new ArrayList<>();

                for (JCheckBox sel : box) {
                    if (sel.isSelected()) {
                        selected.add(sel.getText());
                    }
                }

                int count = selected.size();
                String message = "You have selected " + count + " item" + " they are "+ String.join(" ", selected);

                lb.setText(message);
            }
        });
        
    }
}
