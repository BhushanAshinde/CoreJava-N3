package org.tnsif.customer;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankFactory f=new MMBankFactory();
     MMSavingAcc s=new MMSavingAcc(1234,"Bhushan Shinde",23456f,true);
     MMCurrentAcc c=new MMCurrentAcc(1234,"Bhushan Shinde",23456f,8765f);;
     
   //saving Account
   		System.out.println("Saving Account");
   		System.out.println(s);
   		s.Withdraw(s.getAccbal());
   		
   		//current Account
   		System.out.println("Current account");
   		System.out.println(c);
   		c.Withdraw(c.getAccbal());
	}

}
