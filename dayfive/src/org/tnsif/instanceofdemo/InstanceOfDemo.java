package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name,Address,age");
		String name=s.nextLine();
		String address=s.nextLine();
		int age=s.nextInt();
		
		//object creation
		Child c=new Child();
		Child c1=new Child(name,address,age);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c instanceof person);
		System.out.println(c1 instanceof Child);
		
		

	}

}
