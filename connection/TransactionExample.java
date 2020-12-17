package com.xworkz.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.connection.connectivity.Connectivity;

public class TransactionExample {

	public static void main(String[] args) {
		
		Connectivity connectivity =new Connectivity();
		PreparedStatement empPrerStmt;
		PreparedStatement deptPrerstmt;
		String insertIntoEmp= "insert into emp values (?,?,?)";
		String insertIntoDept= "insert into dept values (?,?,?)";
		
		try (Connection conn=connectivity.getConnection()){
			
			conn.setAutoCommit(false);
			
			
			
			
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.rollback();
		}

	}

}
