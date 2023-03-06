package org.tnsif.framework;

public class CurrentAcc extends BankAcc
{
	private float creditLimit;

	public CurrentAcc(int accno, String accnm, float accbal) {
		super(accno, accnm, accbal);
		this.creditLimit=creditLimit;
	}
	public void Withdraw(float accbal)
	{
		System.out.println("Acc no"+this.getAccno()+" "+"Acc name: "+this.getAccnm()
		+" "+"Account bal: "+(this.getAccbal()));
	}
		
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
