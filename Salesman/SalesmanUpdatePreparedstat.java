package com.xworkz.Salesman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesmanUpdatePreparedstat {

				public static void main(String[] args) {
				
				String sqlQuery = "update salesmandetails set Name = ? where salesman_id = ?";
				
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesman",
						"root", "root"); 
						PreparedStatement prepStmt = conn.prepareStatement(sqlQuery);
					){
					int salesman_id = 15;
					prepStmt.setString(1, "monisha");
					prepStmt.setInt(2, salesman_id);
					
					boolean result = prepStmt.execute();
					System.out.println("Result: "+result);
					
				}catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

		}
	

