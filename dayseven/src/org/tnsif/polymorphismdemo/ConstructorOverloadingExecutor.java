package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed and the color of"+"Honda city");
		int speeds=s.nextInt();
		s.nextLine();
		String color=s.nextLine();
		HondaCity c=new HondaCity();
		HondaCity cl=new HondaCity(speed,color);
		

	}

}
