package org.tnsif.interfacedemo;

//implement class
public class Avenger implements Bike{

	@Override
	public void mileage(int speed) {
		System.out.println("speed is"+speed);
		
	}
	@Override
	public void engine(){
		System.out.println("working on petrol");
		
	}

}
