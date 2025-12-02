package javalab.labFifith;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class stuList {
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root","");
        if(conn != null) {
            System.out.println("Connection successfull");
            return conn;
        }else {
            System.out.println("Connection failed");
            return null;
        }
    }
    public static void main(String[] args) throws SQLException {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(3);
        jf.setSize(600,300);

        DefaultTableModel md = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        md.addColumn("name");
        md.addColumn("location");
        md.addColumn("email");

        String sql = "Select * from students";
        
        try(Connection conn = getConnection();
            Statement stmt = conn.createStatement();
        ) {
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                md.addRow(new Object[]{rs.getString("sname"),rs.getString("location"),rs.getString("email")});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JTable tb = new JTable(md);

        JScrollPane sc = new JScrollPane(tb);
        jf.add(sc);
        jf.setVisible(true);
    }
}
