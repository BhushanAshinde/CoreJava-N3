package org.tnsif.framework;

public abstract class BankFactory {
	//abstract method
		public abstract SavingAcc getNewSavingAcc(int accno, String accnm, float minbal, boolean isSalaried);
		public abstract CurrentAcc getNewCurrentAcc(int accno, String accnm, float accbal, float creaidLimit);
}
