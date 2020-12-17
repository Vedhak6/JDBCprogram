package com.xworkz.connection.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

	public Connection getConnection() throws SQLException{
		
		return  DriverManager.getConnection("jdbc:mysql://localhost:3306/20transowd08",
				"root", "root"); 
		
	}
}
