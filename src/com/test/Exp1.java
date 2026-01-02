package com.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Exp1 {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/mladec";

		String user = "root";

		String pass = "root@39";

		// load the driver class
		Class.forName("com.mysql.jdbc.driver");

		// establish or connection object
		Connection con = DriverManager.getConnection(null);

		// create statement object
		Statement stmt = con.createStatement();

		// execute query
		stmt.execute("create table book1(b_id int,b_name varchar(50),b_price int)");

		// close the connection object
		con.close();
	}
}
