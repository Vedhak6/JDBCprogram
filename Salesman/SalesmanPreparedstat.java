package com.xworkz.Salesman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesmanPreparedstat {
	
			public static void main(String[] args) {
				String sqlQuery = "insert into salesmandetails values(?, ?, ?)";   
				
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesman",
						"root", "root"); 
						PreparedStatement prepStmt = conn.prepareStatement(sqlQuery);
					){
					int salesman_id = 8;
					prepStmt.setInt(1, salesman_id);
					prepStmt.setString(2, "moni");
					prepStmt.setString(3, "tumkur");
					
					
					
					
					boolean issuccessfull = prepStmt.execute(); //CRUD
					//true - ResultSet
					//false - CUD
					System.out.println("was the query execution sucessfull: "+issuccessfull );
					
				}catch (SQLException e) {
					e.printStackTrace();
				}
	}
	}
	

