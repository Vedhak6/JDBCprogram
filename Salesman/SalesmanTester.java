package com.xworkz.Salesman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SalesmanTester {
	
	public static void main(String[] args) {
		ArrayList<Salesman> salesmans=new ArrayList<Salesman>();
		salesmans.add(new Salesman(15,"vidya","mangalore"));
		salesmans.add(new Salesman(16,"swetha","mysore"));
	
		
		for(Salesman salesman: salesmans) {
			insertRow(salesman);
		}
		
	}

	private static void insertRow(Salesman salesman){
		int salesman_id=salesman.getSalesman_id();
		String name=salesman.getName();
		String city=salesman.getCity();
		
		String sqlQuery ="insert into salesmandetails values("+salesman_id+" ,'"+name+"','"+city+"')";
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesman","root","root");
				Statement stat = conn.createStatement();)
		{
			
				int result = stat.executeUpdate(sqlQuery);
			System.out.println("The no of row insert is:"+result);
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
	}

}
