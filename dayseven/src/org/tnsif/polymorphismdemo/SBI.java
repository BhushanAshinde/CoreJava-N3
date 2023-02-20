package org.tnsif.polymorphismdemo;

public class SBI extends RBI{
	Float getInterest()
	{
		System.out.println(super.getInterest());
		return 10.8f;
	}


}
