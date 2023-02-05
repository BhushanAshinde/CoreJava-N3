package org.tnsif.decisionmaking;

import java.util.Scanner;

public class cascadeifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 if(a>b && a>c) {
			 System.out.println("A is grater");
		 }
		 else if(b>a && b>c) {
			 System.out.println("B is grater");
		 }
		 else {
			 System.out.println("C is grater");
		 }
} 
}