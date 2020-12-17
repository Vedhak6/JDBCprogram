package com.xworkz.Salesman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SalesmanUpdate {
		
			public static void main(String[] args) {
				
				String sqlQuery = "update salesmandetails set city = 'NY' where salesman_id=15";
				
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesman",
								"root", "root");
					Statement stmt = conn.createStatement();
					){
					
					int result = stmt.executeUpdate(sqlQuery);  //Updating rows
					System.out.println("The no of rows updated is : "+ result);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				
			}
		
	}