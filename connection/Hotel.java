package com.xworkz.connection;

public class Hotel {
	
	private int id;
	private String hotelname;
	private int noOfRooms ;
	

	public Hotel(int id, String hotelname, int noOfRooms ) {
		super();
		this.id = id;
		this.hotelname = hotelname;
		this.noOfRooms = noOfRooms;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	

	@Override
	public String toString() {
		return "Hotels [id=" + id + ", hotelname=" + hotelname + ", noOfRooms=" + noOfRooms +  "]";
	}

}
