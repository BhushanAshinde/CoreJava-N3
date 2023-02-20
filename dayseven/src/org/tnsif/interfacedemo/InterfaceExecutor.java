package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instatiate the interface
		Avenger a=new Avenger();
		a.engine();
		a.mileage(25);

	}

}
