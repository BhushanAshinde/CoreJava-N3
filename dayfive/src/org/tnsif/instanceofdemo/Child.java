package org.tnsif.instanceofdemo;

public class Child extends person{
	private int age;

	//getter
	public int getAge() {
		return age;
	}
    
	//setter
	public void setAge(int age) {
		this.age = age;
	}
     //default constructor
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
     //parameterise constructor
	public Child(String name,String address,int age) {
		super();
		this.age = age;
	}
    //to string
	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
}
