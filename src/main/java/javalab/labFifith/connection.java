package javalab.labFifith;

import java.sql.*;


public class connection {
    public static void conn() {
        String url = "jdbc:mysql://localhost:3306/school_db";
        try(Connection conn = DriverManager.getConnection(url,"root","");) {
            System.out.println("connection sucessfull");
        } catch(SQLException e) {
            System.out.println("There was a problem while connecting to the connection:\n" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        conn();
    }
}
