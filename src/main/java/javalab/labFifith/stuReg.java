package javalab.labFifith;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class stuReg {
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
        JFrame jf = new JFrame("Student registration");
        jf.setDefaultCloseOperation(3);
        jf.setSize(600,400);
        
        jf.setLayout(new BorderLayout(10,10));

        JPanel info = new JPanel(new GridLayout(4,2));
        
        info.add(new Label("Name:"));
        JTextField nm = new JTextField(20);
        info.add(nm);

        info.add(new Label("location:"));
        JTextField loc = new JTextField(20);
        info.add(loc);

        info.add(new Label("email: "));
        JTextField email = new JTextField(20);
        info.add(email);

        info.add(new Label("password:"));
        JTextField pass = new JTextField(20);
        info.add(pass);

        jf.add(info, BorderLayout.CENTER);

        JButton btn = new JButton("register");
        JPanel pn = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pn.add(btn);

        jf.add(pn,BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql = "INSERT INTO students (sname, location, password, email) VALUES (?,?,?,?)";

                String name = nm.getText();
                if (name == null || name.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please enter the name");
                    return;
                }

                String password = pass.getText();
                if (password == null || password.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please enter the Password");
                    return;
                }

                String em = email.getText();
                if (em == null || em.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please enter the email");
                    return;
                }

                String location = loc.getText();
                if (location == null || location.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please enter the location");
                    return;
                }

                try (Connection con = conn();
                    PreparedStatement stmt = con.prepareStatement(sql)) 
                {
                    stmt.setString(1, name);
                    stmt.setString(2, location);  
                    stmt.setString(3, password);  
                    stmt.setString(4, em);       

                    int rows = stmt.executeUpdate();

                    if (rows > 0) {
                        JOptionPane.showMessageDialog(jf, "Registration successful");
                    } else {
                        JOptionPane.showMessageDialog(jf, "Error inserting data");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(jf, "Database error: " + ex.getMessage());
                }
            }
        });
    }
}
