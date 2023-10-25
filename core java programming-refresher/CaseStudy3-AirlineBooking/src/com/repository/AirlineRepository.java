package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirlineRepository {

	private String userDb="root";
	private String passwordDb="";
	private String url="jdbc:mysql://localhost:3306/hex_fsd_oct_c3";
	private String driver="com.mysql.cj.jdbc.Driver";
	
	Connection con; 
	
	public void dbConnect() {
		/* Step 1: Load the Driver */
		try {
			Class.forName(driver);
			//System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/* Step 2: Establish the connection  */
		try {
			con = DriverManager.getConnection(url, userDb, passwordDb);
			//System.out.println("Connection Established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void dbClose() {
		try {
			con.close();
			//System.out.println("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
