package javalab.labFifith;

import java.sql.*;

public class que2 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/school_db", "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
