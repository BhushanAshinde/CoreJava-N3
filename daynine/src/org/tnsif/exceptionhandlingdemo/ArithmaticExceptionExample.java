package org.tnsif.exceptionhandlingdemo;

public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		try {
			int[] myIntArray = new int[] {1,2,3};
			print(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array doesnt have fourth element");
		}
		System.out.println("Third line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}

}
