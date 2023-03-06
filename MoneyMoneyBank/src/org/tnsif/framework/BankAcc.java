package org.tnsif.framework;

public abstract class BankAcc {

	private int accno;
	private String accnm;
	private float accbal;
	//getters and setters
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	//parameterized constructor
	public BankAcc(int accno, String accnm, float accbal) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accbal = accbal;
	}
	//to string method
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accnm=" + accnm + ", accbal=" + accbal + "]";
	}
	
	public abstract void Withdraw(float accbal);
	public void deposite(float accbal)
	{
		System.out.println(accbal);
	}
	
	
}
