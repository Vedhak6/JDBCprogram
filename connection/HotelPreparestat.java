package com.xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelPreparestat {
	
		public static void main(String[] args) {
			String sqlQuery = "insert into hotels values(?, ?, ?)";   
			
			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/20transowd08",
					"root", "root"); 
					PreparedStatement prepStmt = conn.prepareStatement(sqlQuery);
				){
				int hotelId = 8;
				prepStmt.setInt(1, hotelId);
				prepStmt.setString(2, "Mayyas");
				
				prepStmt.setInt(3, 0);
				
				
				boolean issuccessfull = prepStmt.execute(); //CRUD
				//true - ResultSet
				//false - CUD
				System.out.println("was the query execution sucessfull: "+issuccessfull );
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
}
}