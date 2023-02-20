package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the resolution and slottype"+"of cellphone");
		int resolution=s.nextInt();
		String slottype=s.nextLine();
		s.nextLine();
		Smartphone sp=new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		sp.display(resolution);
		sp.display(resolution, slottype);
		
		Mutiplication m=new Mutiplication();
		System.out.println(m.mul(11,5));
		System.out.println(m.mul(5.2f,3));

	}

}
