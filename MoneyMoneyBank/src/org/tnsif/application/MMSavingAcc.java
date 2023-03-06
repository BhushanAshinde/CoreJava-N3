package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc  extends SavingAcc{

	
	public MMSavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		super(accno, accnm, accbal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	

}
