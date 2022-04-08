package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isPrime = true;
	private static final float deliveryCharges = 0;
	float charges;
	
	public boolean isPrime() {
		return isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges);
		this.isPrime = isPrime;	
		this.charges = charges;
	}
	
	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return (super.toString()+"\n"+"you have a prime account so you don't have to pay delivary charges "+"\n"+"your product charges are "+ charges +" with delivary charges = "+deliveryCharges);
	}
	
} 
