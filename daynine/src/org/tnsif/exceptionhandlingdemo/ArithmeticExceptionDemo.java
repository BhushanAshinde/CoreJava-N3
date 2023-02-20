package org.tnsif.exceptionhandlingdemo;

//program to demonstrate the arithmetic Exception
import java.util.Scanner;


public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block
		try {
		int res=x/y;
		System.out.println(res);
		}
		//catch block
		catch(Exception e)
		{
			System.out.println("Exception handling using catch block "+e);
		}
		

	}

}
