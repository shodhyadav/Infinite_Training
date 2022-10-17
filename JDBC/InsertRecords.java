package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class InsertRecords {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1","root","root");
            Statement stmt=con.createStatement();
            System.out.println(stmt.executeUpdate("insert into sakila.employee values (11, 'Rekha',2)"));
            stmt.close();
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}