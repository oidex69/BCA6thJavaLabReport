package javalab.labSecond;

import javax.swing.*;

public class menuDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Menu Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,300);

        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu Run = new JMenu("Run");
        JMenu src = new JMenu("Source");
        JMenu refac = new JMenu("Refactor");
        JMenu nav = new JMenu("Navigate");
        JMenu ser = new JMenu("Search");
        JMenu opn = new JMenu("Open");
        JMenu win = new JMenu("Window");
        JMenu hlp = new JMenu("Help");

        JMenuItem opnPrj = new JMenuItem("Open Project");
        JMenuItem clPrj = new JMenuItem("Close Project");
        JMenuItem bulAll = new JMenuItem("Build All");
        JMenuItem srchPrj = new JMenuItem("Search Project");

        opn.add(opnPrj);
        opn.add(clPrj);
        opn.add(bulAll);
        opn.add(srchPrj);

        menu.add(file);
        menu.add(edit);
        menu.add(Run);
        menu.add(src);
        menu.add(refac);
        menu.add(nav);
        menu.add(ser);
        menu.add(opn);
        menu.add(win);
        menu.add(hlp);
        
        jf.setJMenuBar(menu);
        jf.setVisible(true);

    }    
}
