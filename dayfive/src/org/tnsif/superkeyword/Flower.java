package org.tnsif.superkeyword;

public class Flower {
	private String name;

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//default constructor
	public Flower() {
		System.out.println(" Flower -parent class");
		// TODO Auto-generated constructor stub
	}
//parameterise constructor
public Flower(String name) {
	super();
	this.name = name;
}
	

}
