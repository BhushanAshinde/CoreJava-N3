package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"Bhushan Shinde",1050f,true);
		GSNormalAcc n=new GSNormalAcc(1234,"dnyan",1050f,60f);
		
		//primeAccount
		System.out.println("prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		//normal Account
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(n.getCharges());
		

	}

}



/*prime Acc
GSPrimeAcc [toString()=PrimeAcc [isPrime=true]]
Acc no1234 Acc name: Bhushan Shinde DeliveryCharges:1050.0
Normal Acc
GSNormalAcc [toString()=NormalAcc [deliveryCharges=60.0]]
Acc no1234 Acc name: dnyan DeliveryCharges:1050.0*/
