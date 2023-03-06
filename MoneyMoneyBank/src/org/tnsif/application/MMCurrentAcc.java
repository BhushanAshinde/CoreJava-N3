package org.tnsif.application;

import org.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accnm, float accbal, float creditLimit) {
		super(accno, accnm, accbal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
}
