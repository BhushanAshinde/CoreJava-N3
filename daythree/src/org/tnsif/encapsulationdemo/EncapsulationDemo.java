package org.tnsif.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setPin(9696);
		System.out.println(h.getPin());
		h.accept();

	}

}
