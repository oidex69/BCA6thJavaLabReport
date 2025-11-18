package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class ListDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("List Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,10,10));

        pn.add(new JLabel("Choose the Planet: "));

        String[] planets = {"Mercury", "Venus", "Earth", "Mars","Jupitar","Saturn","Uranus","Neptune","Pluto"};
        JList<String> list = new JList<>(planets);
        list.setVisibleRowCount(4);
        JScrollPane scrpn = new JScrollPane(list);
        pn.add(scrpn);

        jf.add(pn);
        jf.setVisible(true);

    }
}
