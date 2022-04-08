package com.tns.framework;

public abstract class NormalAcc extends  ShopAcc {
	
	private final float deliveryCharges = 100;
	float charges ;

	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public NormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		
		super(AccNo, accNm, charges);
		this.charges = charges;
	}

	@Override
	public void bookProduct(float charges) {
		
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		
		return (super.toString()+"\n"+"you don't have a prime account so you have to pay delivary charges "+"\n"+"your product charges are "+charges+" with delivary charges = "+deliveryCharges);
	}
	
	

}
 