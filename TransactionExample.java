package com.xworkz.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xworkz.connection.connectivity.*;

public class TransactionExample {

	public static void main(String[] args) {
		
		Connectivity connectivity =new Connectivity();
		
		Connection conn=null;
		PreparedStatement prepStmt=null;

		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel(11,"ctr",0));
		hotels.add(new Hotel(10,"zone",30));
		
		String insertIntoHotel = "insert into hotels values(?,?,?)";
		
		try {
			conn = connectivity.getConnection();
			prepStmt = conn.prepareStatement(insertIntoHotel);
			
			conn.setAutoCommit(false);
			
			for(Hotel hotel:hotels) {
				
				prepStmt.setInt(1,hotel.getId());
				prepStmt.setString(2,hotel.getHotelname());
				prepStmt.setInt(3,hotel.getNoOfRooms());
				
				
				boolean result = prepStmt.execute();
				System.out.println("Result: "+result);
				
				}	
			
			conn.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("rolled back");
		}

	}

}
