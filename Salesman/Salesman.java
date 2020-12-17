package com.xworkz.Salesman;

public class Salesman {

	private int salesman_id;
	private String name;
	private String city;
	
	public Salesman(int id,String name,String city) {
		super();
		this.salesman_id=id;
		this.name=name;
		this.city=city;
	}

	public int getSalesman_id() {
		return salesman_id;
	}

	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Salesman [salesman_id=" + salesman_id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
