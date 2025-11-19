package javalab.labFourth;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class myWin {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My Window");
        jf.setDefaultCloseOperation(3);
        jf.setSize(400,200);

        DefaultTableModel model = new DefaultTableModel();

        // Add columns
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Product");
        model.addColumn("Price in $");
        

        model.addRow(new Object[]{1234,"John","pencil",10});
        model.addRow(new Object[]{4382,"Mirian","pen",11});
        model.addRow(new Object[]{2345,"Katy","chair",253});
        model.addRow(new Object[]{6334,"Agnes","table",456});
        model.addRow(new Object[]{1177,"Stanley","flower",25});
        
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        jf.add(scrollPane);
        jf.setVisible(true);
    }
}
