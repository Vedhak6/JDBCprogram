package com.xworkz.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xworkz.connection.connectivity.*;

public class BatchUpdate {

	public static void main(String[] args) {
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel(21, "MTR", 100));
		hotels.add(new Hotel(22, "Leela palace", 600));
		hotels.add(new Hotel(23, "Heritage", 450));

		String insertQuery = "insert into Hotels values(?, ?, ?)";
		
		Connectivity connectivity =new Connectivity();
		
		
		try (Connection conn=connectivity.getConnection();
				PreparedStatement prepstmt = conn .prepareStatement(insertQuery);){
		
			for(Hotel hotel : hotels) {  
				prepstmt.setInt(1, hotel.getId());
				prepstmt.setString(2, hotel.getHotelname());
				prepstmt.setInt(3, hotel.getNoOfRooms());
				
				prepstmt.addBatch();
			}
			prepstmt.addBatch("update hotels set name = 'Aramane' where idHotels=7");
				
				int[] results=prepstmt.executeBatch();
				
				for(int i : results) {
				System.out.println(i);
			
				}
			
		
	  }
		catch(SQLException e) {
		e.printStackTrace();
	}

	}
}