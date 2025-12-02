package javalab.labFifith;

import java.awt.Component;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class updStu {

    // Database connection
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db", "root", "");
        if (conn != null) {
            System.out.println("Connection successful");
            return conn;
        } else {
            System.out.println("Connection failed");
            return null;
        }
    }

    // Update a row in the database
    static void updateRow(int row, JTable tb) {
        try {
            String name = tb.getValueAt(row, 0).toString();
            String location = tb.getValueAt(row, 1).toString();
            String email = tb.getValueAt(row, 2).toString();
            System.out.println(name+location+email);

            try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(
                        "UPDATE students SET location=?, email=? WHERE sname=?")) {
                

                ps.setString(1, location.trim());
                ps.setString(2, email.trim());
                ps.setString(3, name.trim());

                int updated = ps.executeUpdate();
                System.out.println("here");

                if (updated > 0) {
                    System.out.println("Row updated: " + name);
                } else {
                    System.out.println("No row updated for: " + name);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    static void delete(int row, JTable tb) {
        if (row < 0) return;

        String name = tb.getValueAt(row, 0).toString();

        new Thread(() -> {
            try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(
                        "DELETE FROM students WHERE sname=?")) {

                ps.setString(1, name.trim());
                int deleted = ps.executeUpdate();

                if (deleted > 0) {
                    System.out.println("Row deleted: " + name);
                    // Remove row from table on the EDT
                    SwingUtilities.invokeLater(() -> ((DefaultTableModel) tb.getModel()).removeRow(row));
                } else {
                    System.out.println("No row deleted for: " + name);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }


    public static void main(String[] args) {
        JFrame jf = new JFrame("Update Students");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 300);

        // Table model with editable location only
        DefaultTableModel md = new DefaultTableModel(
                new Object[]{"sname", "location", "email", "Update", "Delete"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Only location (1) is editable, Update button column handled separately
                return column == 1;
            }
        };

        // Fetch data from database
        String sql = "SELECT * FROM students";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                md.addRow(new Object[]{
                        rs.getString("sname"),
                        rs.getString("location"),
                        rs.getString("email"),
                        "Update",
                        "Delete"
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JTable tb = new JTable(md);

        // Set renderer for "Update" column to look like a button
        tb.getColumn("Update").setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton btn = new JButton("Update");
            return btn;
        });
        tb.getColumn("Delete").setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton btn = new JButton("Delete");
            return btn;
        });

        // Add mouse listener for button clicks
        tb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tb.rowAtPoint(e.getPoint());
                int col = tb.columnAtPoint(e.getPoint());

                if (col == 3) { // Update button column
                    System.out.println(row);
                    updateRow(row, tb);
                }

                if (col == 4) {
                    delete(row,tb);
                }
            }
        });

        JScrollPane sc = new JScrollPane(tb);
        jf.add(sc);
        jf.setVisible(true);
    }

}
