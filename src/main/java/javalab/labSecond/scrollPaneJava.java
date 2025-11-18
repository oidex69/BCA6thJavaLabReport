package javalab.labSecond;

import javax.swing.*;

public class scrollPaneJava {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Scroll Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);

        JScrollPane scpn = new JScrollPane();

        // Force both scrollbars always visible
        scpn.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scpn.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        jf.add(scpn);
        jf.setVisible(true);
    }
}
