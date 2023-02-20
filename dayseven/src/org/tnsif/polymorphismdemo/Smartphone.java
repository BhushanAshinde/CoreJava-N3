package org.tnsif.polymorphismdemo;

//program to demonstrate on Method overloading
public class Smartphone {
	
	//method poverloading in terms of by pssing argument
	private int resolution;
	private String slottype;
	void display (int resolution)
	{
		System.out.println("Camera resolution: "+resolution);
	}
	void display(int resolution,String Slottype)
	{
		System.out.println("Camera resolution: "+slottype);
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

}
