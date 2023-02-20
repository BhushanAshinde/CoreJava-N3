package org.tnsif.costomexception;

public class LoginCredential  extends Exception {
	private String str;
	
	public static void main(String[] args) {
		super();
		this.str =str;
	}

	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
	
	
}
