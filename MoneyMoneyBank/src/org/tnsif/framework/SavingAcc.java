package org.tnsif.framework;

public class SavingAcc extends BankAcc {
	
	
private boolean isSalaried;
private  float Minbal;
	public SavingAcc(int accno, String accnm, float accbal, boolean isSalaried2) {
		super(accno, accnm, accbal);
		// TODO Auto-generated constructor stub
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public float getMinbal() {
		return Minbal;
	}
	public void setMinbal(float minbal) {
		Minbal = minbal;
	}
	//parameter constructor
	public SavingAcc(int accno, String accnm, float accbal, boolean isSalaried, float minbal) {
		super(accno, accnm, accbal);
		this.isSalaried = isSalaried;
		Minbal = minbal;
	}
	@Override
	public void Withdraw(float accbal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", Minbal=" + Minbal + "]";
	}
	
	

}
