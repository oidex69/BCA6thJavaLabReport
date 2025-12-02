package javalab.labFifith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while (cont) {
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.println("Enter name:");
            String s = sc.nextLine();

            System.out.println("Enter position:");
            String pos = sc.nextLine();

            System.out.println("Enter salary:");
            double sal = sc.nextDouble();
            sc.nextLine(); // clear buffer

            String sql = "INSERT INTO employee (id, nm, pos, sal) VALUES (?, ?, ?, ?)";

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db", "root", "");
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, id);
                stmt.setString(2, s);
                stmt.setString(3, pos);   // corrected index
                stmt.setDouble(4, sal);

                int rwCnt = stmt.executeUpdate();

                if (rwCnt > 0)
                    System.out.println("Insert successful");
                else
                    System.out.println("Insertion failed");

            } catch (SQLException e) {
                System.out.println("Connection error: " + e.getMessage());
            }

            System.out.println("Do you want to continue? (y/n):");
            String ans = sc.nextLine();
            cont = ans.equalsIgnoreCase("y");
        }

        sc.close();
    }
}
