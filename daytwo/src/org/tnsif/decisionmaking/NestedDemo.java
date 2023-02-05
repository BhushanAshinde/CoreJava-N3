package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the age and weight of the person");
				int age =s.nextInt();
				int weight =s.nextInt();
				if(age>=12)
				{
					if(weight>=40)
					{
						if(weight<120)
						{
							System.out.println("Eligible for BunjeeJumping");
						}
						else
						{
							System.out.print("Ertra ropes will be added");
						}
					}
					else 
					{
						System.out.print("Not eligible for bunjee jumping");
					}
				}
				else
				{
					System.out.print("Not eligible for Bunjee Jumping");

				}
			}
	}


