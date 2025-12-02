package javalab.labFifith;

import java.sql.*;
public class que5 {
    static Connection conn=null;
    static Statement stmt=null;
    static ResultSet rs;
    public static void display(String s) throws Exception{
         System.out.println(s+rs.getInt("id")+","+rs.getString("nm"));
    }
    public static void main(String[] args) {
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root", "");

            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery("SELECT * FROM employee");
            rs.first();
            display("First:");
            rs.last();
            display("Last:");
            rs.previous();
            display("Previous:");
            rs.absolute(1);
            display("Absolute:");
            rs.next();
            display("Next:");
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