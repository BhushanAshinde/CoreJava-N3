package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

public class ThrowKeywordDemo {
	
	public static void donate(int age, int weight) throws Exception
	{
		if(age>18 && weight>50)
			System.out.println("Elegible to donate blood");
		else
			throw new IOException("not elegible");
	}
	
	public static void main(String[] args) throws Exception/ {
		try
		{
			donate(17,55);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
