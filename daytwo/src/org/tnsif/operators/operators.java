package org.tnsif.operators;
import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x=sc.nextInt();//2
		int y=sc.nextInt();//5

		//*****-*****-*****Arithmetic Operators Below*****-*****-*****
		System.out.println(x+y);//7
		System.out.println(x-y);//-3
		System.out.println(x*y);//10
		System.out.println(x/y);//0
		System.out.println(x%y);//2

		//*****-*****-*****Relational Operators Below*****-*****-*****
		boolean res=x>y;
		System.out.println(res);//False

		//*****-*****-*****Assignment Operators Below*****-*****-*****
		x*=y;
		System.out.println("value of x: "+x);//value of x: 10

		//*****-*****-*****Logical Operators Below*****-*****-*****
		boolean res1=(5==5)&&(5>4);//True
		boolean res2=(5==4)||(5>2);//True
		boolean res3=!(5==4);//True
		System.out.println("res1 is : "+res1);//res1 is : true
		System.out.println("res2 is : "+res2);//res2 is : true
		System.out.println("res3 is : "+res3);//res3 is : true

		//*****-*****-*****Bitwise Operators Below*****-*****-*****
		int a=12 & 5;
		int b=12 | 5;
		int c=12^5;
		System.out.println("value of a is: "+a);//value of a is: 4
		System.out.println("value of b is: "+b);//value of a is: 13
		System.out.println("value of c is: "+c);//value of a is: 9

		//*****-*****-*****Ternary Operators Below*****-*****-*****
		String res4=(12%2==0)?"True":"False";
		System.out.println("res4 is : "+res4);//res4 is : TRUE OR EVEN

		//*****-*****-*****Increment and Decrement Below*****-*****-*****
		int p= x++;
		int q= --x;
		System.out.println("value of p is: "+p);//value of P is: 10
		System.out.println("value of q is: "+q);//value of q is: 10
			}

}
