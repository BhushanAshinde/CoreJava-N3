package org.tnsif.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		//to print 1 to N numbers
		for (int i=1; i<=n; i++)
		{
			System.out.println(i+ " ");
		}
		System.out.println();
		//to print N to 1
		for (int i=n; i>=1; i--)
		{
			System.out.println(i+ " ");
		}
		
	}
		

}
