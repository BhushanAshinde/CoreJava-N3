package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("enter the value of n");
		int n=s.nextInt();
		int i=1;
		//to print 1 to N numbers
		while(i<=n)
		{
			System.out.println(i+" ");
			i++;
		}
		System.out.println(i+" ");
		
		i=1;
		//to print N to 1 numbers
				while(n>=i)
				{
					System.out.println(n+" ");
					n--;
				}

		

	}

}
