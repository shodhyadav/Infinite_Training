package JDBC;

import java.sql.*;
import java.util.Scanner;

class PreparedStatementTest {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila","root","root");

//            insertRecord(con);
//            updateRecord(con);
            deleteRecord(con);
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
    static void insertRecord(Connection con) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int id= sc.nextInt();
        String name = sc.next();
        int managerId = sc.nextInt();
        PreparedStatement stmt=con.prepareStatement("insert into employee values (?, ?,?)");
        stmt.setInt(1,id);
        stmt.setString(2,name);
        stmt.setInt(3,managerId);
        int record =  stmt.executeUpdate();
        System.out.println(record +" record is inserted ");
        stmt.close();
    }

    static void updateRecord(Connection con) throws SQLException {
        PreparedStatement stmt=con.prepareStatement("update employee set manager_id = ? where employeeId = ?");
        stmt.setInt(1,5);
        stmt.setInt(2,11);
        int record =  stmt.executeUpdate();
        System.out.println(record+" record is updated");
        stmt.close();
    }

    static void deleteRecord(Connection con) throws SQLException {
        PreparedStatement stmt=con.prepareStatement("delete from employee where employeeId = ?");
        stmt.setInt(1,12);
        int record =  stmt.executeUpdate();
        System.out.println(record+" record is deleted");
        stmt.close();
    }
}