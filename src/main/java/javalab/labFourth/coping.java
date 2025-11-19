package javalab.labFourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class coping {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Choose the color");
        jf.setDefaultCloseOperation(3);
        jf.setSize(600,300);

        jf.setLayout(new FlowLayout(FlowLayout.CENTER));

        String[] colors = {"apple", "orange", "banana", "grapes", "guava", "peach", "mango", "kiwi"}; 
        JList<String> list = new JList<>();
        list.setVisibleRowCount(5);
        list.setFixedCellHeight(15);
        list.setFixedCellWidth(100);
        list.setListData(colors);

        JScrollPane scPn = new JScrollPane(list);
        jf.add(scPn);
        
        JButton btn  = new JButton("Copy>>");
        JTextArea area = new JTextArea(5,10);
        
        jf.add(btn);
        jf.add(area);
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                area.append(list.getSelectedValue()+"\n");
            }
        });


    }
}
