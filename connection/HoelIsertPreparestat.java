package com.xworkz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class HoelIsertPreparestat {

		public static void main(String[] args) {
			
			ArrayList<Hotel> hotels = new ArrayList<Hotel>();
			hotels.add(new Hotel(12, "MTR", 0));
			hotels.add(new Hotel(13, "Leela palace", 60 ));
			hotels.add(new Hotel(14, "Heritage", 45));

			String insertQuery = "insert into Hotels values(?, ?, ?)";
			try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/20transowd08",
					"root", "root"); 
				PreparedStatement prepstmt = conn.prepareStatement(insertQuery);
					){
				
				for(Hotel hotel : hotels) {  
					prepstmt.setInt(1, hotel.getId());
					prepstmt.setString(2, hotel.getHotelname());
					prepstmt.setInt(3, hotel.getNoOfRooms());
					
					
					boolean result = prepstmt.execute();
					System.out.println("Result: "+result);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}

	}
	
	

