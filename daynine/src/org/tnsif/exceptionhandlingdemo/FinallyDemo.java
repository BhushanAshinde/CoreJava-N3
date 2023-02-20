package org.tnsif.exceptionhandlingdemo;
//program to demonstrate finally block contains exception
public class FinallyDemo {

	public static void main(String[] args) {

		try {
			int arr[]=new int[] {101,12,123};
			System.out.println("C2TC");
			//1.when it calls to system.exit(0);
			//System.exit(0);
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handle: "+e);
			//System.exit(0);
		}
		finally {
			int res=12/0;
			System.out.println(res);
			System.out.println("finally blocks");
		}
		
	}

}
