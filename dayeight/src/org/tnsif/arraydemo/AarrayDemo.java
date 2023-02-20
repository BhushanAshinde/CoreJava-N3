package org.tnsif.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class AarrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS"
				+ "IN THE ARRAY");
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{	
			System.out.println(arr[i]+" ");
		}
Arrays.sort(arr);
/* for(int i=0;i<n;i++);
 * 
 */
	}
	
	}

