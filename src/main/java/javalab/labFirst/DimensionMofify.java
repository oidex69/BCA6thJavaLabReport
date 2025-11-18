package javalab.labFirst;

import java.awt.Dimension;
import javax.swing.*;
public class DimensionMofify {
    public static void main(String []args)
    {
        Dimension dim = new Dimension(600,400);
        JFrame jf = new JFrame("my first gui program");
        jf.setPreferredSize(dim);
        jf.pack();
        jf.setVisible(true);
    }

}
