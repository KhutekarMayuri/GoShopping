package com.tns.application;

import com.tns.framework.*;

public class Main {

	public static void main(String[] args) {
		
		ShopFactory shopfactory = new GSShopFactory();
		PrimeAcc  primeacc = new  GSPrimeAcc(1, "Harsh", 1000, true);
		NormalAcc  normalacc = new  GSNormalAcc(1, "Mayuri", 1000, 100);
		
		primeacc.bookProduct(1000);
		normalacc.bookProduct(1000);
		
		System.out.println(primeacc.toString());
		System.out.println();
		System.out.println(normalacc.toString());
		

	}

}
