package org.tnsif.arraydemo;

import java.util.Scanner;

public class Arrayobjectdemo {

	public static void main(String[] args) {
		Student arr[];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements "
				+ "in the array");
		int n=s.nextInt();
		arr=new Student[n];
		int i=0;
		while(i<n)
		{
		arr[i]=new Student(s.nextInt(),s.next(),s.nextFloat());
		i++;
		
	}
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j].getRollno()+
					""+arr[j].getName()+" "+
					arr[j].getPercentage());
		}
	}}
