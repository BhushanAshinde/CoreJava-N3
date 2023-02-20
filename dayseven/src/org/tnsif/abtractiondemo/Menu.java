package org.tnsif.abtractiondemo;

//program to demonstrate abstract class and abstract method
//abstract class
//class cannot be final abstract
public abstract class Menu {
	//Abstract method
	abstract void recipe();
	abstract void foodType();
	//concrete method
	void menuType()
	{
		System.out.println("veg and Nonveg");
	}
	

}
