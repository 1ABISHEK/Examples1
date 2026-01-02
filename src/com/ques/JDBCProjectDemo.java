package com.ques;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class JDBCProjectDemo {
 
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mladec";
        String user = "root";
        String pass = "root@39";
 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
 
        String createTableSQL = "create table if not exists holiday_reservations (" +
                                "reservation_id int primary key auto_increment, " +
                                "traveler_name varchar(50), " +
                                "city varchar(50), " +
                                "amount int)";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(createTableSQL);
        System.out.println("table 'holiday_reservations' created successfully");
 
        String insertSQL = "insert into holiday_reservations (traveler_name, city, amount) values (?, ?, ?)";
        PreparedStatement insertStmt = con.prepareStatement(insertSQL);
 
        insertStmt.setString(1, "Abishek");
        insertStmt.setString(2, "K S");
        insertStmt.setInt(3, 48000);
        insertStmt.executeUpdate();
 
        insertStmt.setString(1, "Sahana");
        insertStmt.setString(2, "N");
        insertStmt.setInt(3, 52000);
        insertStmt.executeUpdate();
 
        insertStmt.setString(1, "Adhavan");
        insertStmt.setString(2, "N");
        insertStmt.setInt(3, 61000);
        insertStmt.executeUpdate();
 
        System.out.println("holiday reservations inserted successfully");
 
        String selectSQL = "select * from holiday_reservations";
        PreparedStatement selectStmt = con.prepareStatement(selectSQL);
        ResultSet rs = selectStmt.executeQuery();
 
        System.out.println("\n--- holiday reservations ---");
        while (rs.next()) {
            System.out.println("reservation id: " + rs.getInt("reservation_id") +
                               ", traveler: " + rs.getString("traveler_name") +
                               ", city: " + rs.getString("city") +
                               ", amount: " + rs.getInt("amount"));
        }
 
        rs.close();
        insertStmt.close();
        selectStmt.close();
        stmt.close();
        con.close();
    }
}
 