package com.bilgeadam.week2.lecture002;

public class Question2 {

	/*
	 * Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz bir ürün fiyatım
	 * olsun bu ürün fiyatından ham fiyatı.
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		double rawPrice = 0, price = 100, priceWithoutVat;
		priceWithoutVat = price / 1.18;
		System.out.println("KDV'siz fiyatı" + priceWithoutVat);
		rawPrice = priceWithoutVat / 1.15;
		System.out.println("Ham fiyatı" + rawPrice);

	}

}
