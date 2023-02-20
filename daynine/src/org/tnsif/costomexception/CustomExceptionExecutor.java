package org.tnsif.costomexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=id!=s.nextLine();
		s.nextLine();
		String password=s.nextLine();
		try
		{
			if(id!.equals"shindebhushan666@gmail.com" && password!="abc123")
				throw new LoginCredential("Invalid credentiials credentials");	
		}
		catch(LoginCredential e)
		{
			System.out.println("Exception handled"+e);
		}
		finally
		{
			System.out.println("finally block");
		}
		
	}

}
