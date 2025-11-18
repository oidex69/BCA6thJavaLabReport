package javalab.labSecond;

import javax.swing.*;
import java.awt.*;

public class sportsList {
    public static void main(String[] args) {
        JFrame jf = new JFrame("List");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,200);

        Panel pn = new Panel(new FlowLayout(FlowLayout.CENTER,20,30));

        pn.add(new Label("Select your favorite sports from the list: "));

        String[] litm = {"Badminton", "Hockey","Tennis", "Football", "Cricket", "Formula One", "Rugby"};
        JList<String> list = new JList<>(litm);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        pn.add(list);
        jf.add(pn);
        jf.setVisible(true);
        
    }
}
