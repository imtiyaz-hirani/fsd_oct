package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.InternationalRoutes;
import com.mysql.cj.xdevapi.PreparableStatement;

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

	public List<InternationalRoutes> fetchFlights(String source, String destination) {
		dbConnect();
		String sql="select id,source,destination,duration,fare,flight_id "
				+ " from international_routes where source=? AND destination=?" ;
		List<InternationalRoutes> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, source);
			pstmt.setString(2, destination);
			ResultSet rst = pstmt.executeQuery();
			while(rst.next()) {
				int id = rst.getInt("id"); 
				double duration = rst.getDouble("duration");
				double fare = rst.getDouble("fare");
				int flight_id= rst.getInt("flight_id");
				
				InternationalRoutes route = new InternationalRoutes(); 
				route.setId(id);
				route.setSource(source);
				route.setDestination(destination);
				route.setDuration(duration);
				route.setFare(fare);
				route.setFlight_id(flight_id);
				
				list.add(route);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbClose();
		return list;
	}

	public double getDetailsByFlightId(int flightID) {
		 dbConnect();
		 String sql="select fare from international_routes where flight_id=?";
		 double fare = 0; 
		 try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, flightID);
			ResultSet rst = pstmt.executeQuery();
			
			rst.next(); //point rst cursor to first row.
			fare = rst.getDouble("fare");
			
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		 
		 dbClose();
		return fare;
	}
}







