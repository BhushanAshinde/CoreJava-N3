package org.tnsif.polymorphismdemo;

//method overloading in terms of
public class Mutiplication {
	int mul(int x,int y)
	{
		return x*y;
	}
	int mul(float x,int y)
	{
		return (int) (x*y);
	}

}
