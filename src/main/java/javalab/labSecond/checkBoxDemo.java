package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class checkBoxDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box Demo");
        jf.setDefaultCloseOperation(3);
        jf.setSize(600,400);

        Panel pn = new Panel(new GridLayout(8,1));
        
        pn.add(new JLabel("Choose a Program to enroll:"));
        pn.add(new Checkbox("C"));
        pn.add(new Checkbox("Java"));
        pn.add(new Checkbox("HTML"));
        pn.add(new Checkbox("PHP"));
        pn.add(new JLabel("Payment:"));
        pn.add(new Checkbox("Now"));
        pn.add(new Checkbox("Later"));

        jf.add(pn);
        jf.setVisible(true);
    }
    
}
