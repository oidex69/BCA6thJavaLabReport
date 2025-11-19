package javalab.labFourth;

import javax.swing.*;
import java.awt.*;

public class tabs {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JTabbe Pane demo");
        jf.setDefaultCloseOperation(3);
        jf.setSize(400,300);

        JTabbedPane pn = new JTabbedPane();

        JPanel das = new JPanel(new FlowLayout(FlowLayout.CENTER));
        das.add(new JLabel("Welcome to IOC"));

        JPanel cors = new JPanel(new GridLayout(5,1));

        JPanel crostit = new JPanel(new FlowLayout(FlowLayout.CENTER));
        crostit.add(new Label("Select the course"));

        cors.add(crostit);
        cors.add(new JCheckBox("C"));
        cors.add(new JCheckBox("C++"));
        cors.add(new JCheckBox("Java"));
        cors.add(new JCheckBox("PHP"));

        JPanel com = new JPanel(new FlowLayout(FlowLayout.CENTER));
        com.add(new Label("Leave a Comment"));
        com.add(new TextArea(12,35));

        pn.addTab("Dashboard", das);
        pn.addTab("Courses", cors);
        pn.addTab("Comment", com);

        jf.add(pn);
        jf.setVisible(true);
    }
}
