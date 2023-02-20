package org.tnsif.classesandobject;

public class Customer {
	private int id;
	private String customer;
	private String city;
public Customer() {
	super();
}
	public Customer(int id, String customer, String city) {
		super();
		this.id = id;
		this.customer = customer;
		this.city = city;
	}

       void display() {
    	   System.out.println(id+" "+city+" "+"customer");
       }

       
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
	}

