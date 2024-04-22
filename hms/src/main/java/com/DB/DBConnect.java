package com.DB;
//this class is used to provide connection with the database .we can load the driver class etc.

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
private static Connection connect;

public static Connection getConnect() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","raja9315");
	} catch (Exception e) {
	e.printStackTrace();
	}
	return connect;
	
}

}
