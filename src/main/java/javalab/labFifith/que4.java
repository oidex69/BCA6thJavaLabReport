package javalab.labFifith;

import java.sql.*;
import java.util.Scanner;

public class que4 {

    String sql;

    Connection getConn() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school_db",
                "root",
                ""
        );
    }

    // CREATE: Insert new employee
    void insert(Connection conn, int id, String nm, String pos, double sal) throws SQLException {
        sql = "INSERT INTO employee (id, nm, pos, sal) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, nm);
            stmt.setString(3, pos);
            stmt.setDouble(4, sal);

            int r = stmt.executeUpdate();
            System.out.println(r > 0 ? "Insert successful" : "Insert failed");
        }
    }

    // UPDATE: Update a single column
    void update(Connection conn, String column, String newValue, int id) throws SQLException {
        sql = "UPDATE employee SET " + column + " = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newValue);
            stmt.setInt(2, id);

            int r = stmt.executeUpdate();
            System.out.println(r > 0 ? "Update successful" : "Update failed");
        }
    }

    void select(Connection conn) throws SQLException {
        sql = "SELECT * FROM employee";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("ID | Name | Position | Salary");
            System.out.println("-------------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("nm") + " | " +
                        rs.getString("pos") + " | " +
                        rs.getDouble("sal")
                );
            }
        }
    }

    void delete(Connection conn, int id) throws SQLException {
        sql = "DELETE FROM employee WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int r = stmt.executeUpdate();
            System.out.println(r > 0 ? "Delete successful" : "Delete failed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        que4 q = new que4();

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Select");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int ch = sc.nextInt();
            sc.nextLine();

            try (Connection conn = q.getConn()) {

                switch (ch) {
                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt(); sc.nextLine();

                        System.out.print("Name: ");
                        String nm = sc.nextLine();

                        System.out.print("Position: ");
                        String pos = sc.nextLine();

                        System.out.print("Salary: ");
                        double sal = sc.nextDouble();

                        q.insert(conn, id, nm, pos, sal);
                        break;

                    case 2:
                        System.out.print("Column to update (nm/pos/sal): ");
                        String col = sc.nextLine();

                        System.out.print("New value: ");
                        String val = sc.nextLine();

                        System.out.print("ID to update: ");
                        int uid = sc.nextInt();

                        q.update(conn, col, val, uid);
                        break;

                    case 3:
                        q.select(conn);
                        break;

                    case 4:
                        System.out.print("ID to delete: ");
                        int did = sc.nextInt();
                        q.delete(conn, did);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (SQLException e) {
                System.out.println("SQL Error: " + e.getMessage());
            }
        }
    }
}
