package org.tnsif.classesandobject;

import java.util.Scanner;

public class ConstructorDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter id, name,city");
	int id=sc.nextInt();
	String customer = sc.next();
	String city = sc.next();
	sc.close();
	Customer c = new Customer();
	c.setId(id);
	c.setCustomer(customer);
	c.setCity(city);
	c.display();
	
}
}
