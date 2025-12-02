package javalab.labFifith;

import java.sql.*;
public class que6{
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root", "");

            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
            while(rs.next())
                System.out.println(rs.getInt("id")+","+rs.getString("nm"));
            rs.last();
            rs.updateInt("id", 9);
            rs.updateRow();
            System.out.println("\nRow updated\n");
            rs.absolute(0);
            while(rs.next())
                System.out.println(rs.getInt("id")+","+rs.getString("nm"));
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                stmt.close();
                conn.close();
            }catch(Exception e){}
        }
    }
}