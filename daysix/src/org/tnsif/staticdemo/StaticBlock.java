package org.tnsif.staticdemo;
//program to demonstrate static block
public class StaticBlock {
	
	//non ststic variable
	private int num;
	
	//ststic variable
	private static String name;
	
	//getter
	public int getNum() {
		return num;
	}

	//setter
	public void setNum(int num) {
		this.num = num;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		StaticBlock.name = name;
	}


	//static Block
	//static block is used to initialise static variable
	static
	{
		name="Bhushan";
		
	}
	

}
