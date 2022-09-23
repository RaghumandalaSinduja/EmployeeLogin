package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.dao.EmployeeDAO;
import com.jdbc.JDBCConnection;

public class Testing {
	public boolean isConnected() throws SQLException{
		Connection con=JDBCConnection.getConnection();
		return con!=null;
		
		
	}
	public int isaUser()
	{
		EmployeeDAO dao=new EmployeeDAO();
		int empId=704834;
		String empName="Sinduja";
		boolean isValidUser=dao.isValidUser(empId, empName);
		if(isValidUser) return 1;
		return 0;
	}

}
