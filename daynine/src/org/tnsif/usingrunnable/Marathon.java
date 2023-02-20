package org.tnsif.usingrunnable;
//Program to demonstrate on Runnable interface


public class Marathon implements Runnable {

	
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	private String City;
	@Override
	public void run() {
		System.out.println("speed of a participants: "+speed +"The city is: "+City);
		
	}

}
