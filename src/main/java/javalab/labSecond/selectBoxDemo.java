package javalab.labSecond;

import javax.swing.*;

import java.awt.*;

public class selectBoxDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,20,100));

        pn.add(new Label("Which Language You like most?"));
        String[] pgm = {"C","Java","Python","C++","DotNet"};
        JComboBox<String> cmbBx = new JComboBox<>(pgm);

        pn.add(cmbBx);

        System.out.println("Number of items: "+cmbBx.getItemCount());
        System.out.println("Number of items: "+cmbBx.getSelectedItem());
        cmbBx.setSelectedIndex(cmbBx.getItemCount()-1);

        jf.add(pn);
        jf.setVisible(true);


    }
}
