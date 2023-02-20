package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter th value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]=new int[] {11,22,33};
		
		try
		{
			int res=x/y;
			System.out.println(res);
		try 
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			
		}
		try {]

}

