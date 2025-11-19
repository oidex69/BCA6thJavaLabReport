package javalab.labFourth;

import javax.swing.*;
import java.awt.*;


public class menuOpn {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(3);
        jf.setSize(400,300);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));

        JMenuBar bar = new JMenuBar();

        JMenu nrm = new JMenu("Normal menu");
        JMenu rad= new JMenu("Radio Menu");
        JMenu chck = new JMenu("Check Menu");
        
        JMenuItem nw = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");

        nrm.add(nw);
        nrm.add(open);

        JRadioButton frst = new JRadioButton("First Radio Otion");
        JRadioButton scnd = new JRadioButton("Second Radio Option");
        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(frst);
        btngrp.add(scnd);

        rad.add(frst);
        rad.add(scnd);
        
        JCheckBox fst = new JCheckBox("first check option");
        JCheckBox snc = new JCheckBox("second check option");

        chck.add(fst);
        chck.add(snc);

        bar.add(nrm);
        bar.add(rad);
        bar.add(chck);

        jf.add(bar);
        jf.setVisible(true);

    }
}
