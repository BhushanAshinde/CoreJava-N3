package org.tnsif.polymorphismdemo;

//program to demonstrate cponstructor overloading
public class HondaCity {
	private int speed;
	private String color;
	public int getSpeed() {
		return speed;
	}

	/*
	 * public void setSpeed(int speed) { this.speed = speed; } public String
	 * getColor() { return color; } public void setColor(String color) { this.color
	 * = color; }
	 */
	public HondaCity(int speed,String color) {
		super();
		this.speed=speed;
		this.color=color;
	}
}
