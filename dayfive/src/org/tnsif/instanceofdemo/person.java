package org.tnsif.instanceofdemo;

//parent class


public class person {
	//
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public person() {
		System.out.println("Parent class");
		// TODO Auto-generated constructor stub
	}
	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
