package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeRepository {
	private String userDb="root";
	private String passwordDb="";
	private String url="jdbc:mysql://localhost:3306/hex_fsd_oct_cs2";
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

	public void insertEmployee(Employee employee) {
		dbConnect();
		// Query to insert the record in DB
		String sql="insert into employee(name,department,salary) values (?,?,?)"; //parameterized query
		/* Prepare to execute Query */
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, employee.getName());
			pstmt.setString(2, employee.getDepartment());
			pstmt.setDouble(3, employee.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbClose();
	}

	public List<Employee> getAllEmployee() {
		dbConnect();
		String sql="select id,name,department,salary from employee";
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();	
			while(rst.next()) {
				int id = rst.getInt("id");
				String name = rst.getString("name");
				String department = rst.getString("department");
				double salary = rst.getDouble("salary");
				
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(name);
				employee.setSalary(salary);
				employee.setDepartment(department);
				
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbClose();
		return list;
	}

	public void deleteEmployee(int id) {
		dbConnect();
		String sql="delete from employee where id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbClose();
		
	}
	
	//Note: Parameterized queries protect us from SQL injections attack. 
}

/* 
 * 2 Methods: 
 * executeQuery(): select - fetching something from DB 
 * executeUpdate(): update,delete,insert  
 * 
 */