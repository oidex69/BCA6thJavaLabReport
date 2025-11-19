package javalab.labFifith;

import  java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginVal {
    public static Connection conn() {
        String url = "jdbc:mysql://localhost:3306/school_db";
        try {
            Connection conn = DriverManager.getConnection(url,"root","");
            System.out.println("connection sucessfull");
            return conn;
        } catch(SQLException e) {
            System.out.println("There was a problem while connecting to the connection:\n" + e.getMessage());
            return  null;
        }
    }    

    public static void main(String[] args) {
        JFrame jf = new JFrame("Login Validation");
        jf.setDefaultCloseOperation(3);
        jf.setSize(600,400);

        jf.setLayout(new BorderLayout(10,10));

        Panel pn = new Panel(new GridLayout(2,2,10,10));
        
        pn.add(new Label("Name:"));
        JTextField nm = new JTextField(15);
        pn.add(nm);

        pn.add(new Label("Password"));
        JPasswordField pass = new JPasswordField(15);
        pn.add(pass);
        
        jf.add(pn,BorderLayout.CENTER);
        JPanel bpn = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btn = new JButton("Submit");
        bpn.add(btn);
        jf.add(bpn,BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);
        
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String name = nm.getText();
                String ps = new String(pass.getPassword()); // for JPasswordField

                String sql = "SELECT pass FROM users WHERE ur_name = ?";

                try (Connection con = conn();
                    PreparedStatement stmt = con.prepareStatement(sql)) {

                    stmt.setString(1, name);

                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        String dbPass = rs.getString("pass");

                        if (dbPass.equals(ps)) {
                            System.out.println("Login successful");
                        } else {
                            System.out.println("Incorrect password");
                        }
                    } else {
                        System.out.println("User not found");
                    }

                } catch (SQLException ex) {
                    System.out.println("Error while phrasing the sql" + ex.getMessage());
                }
            }
        });
    }
}
