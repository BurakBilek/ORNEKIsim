package com.bilgeadam.week2.lucture03;

public class Question11 {

	/*
	 * 1 den başlayarak gelen büyün sayıları toplayalım.toplamımız 50 yi geçene
	 * kadar çalışsın. en son toplamı yzdıralım ve bu döngünün kaç kere
	 * çalıştığınını yazalım
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int toplam = 0;
		int i = 0;
		int sayac = 0;

		while (toplam <= 50) {
			toplam += i;
			sayac = i;
			i++;
			System.out.println("toplam =>>" + toplam + " - döngü =>>" + sayac);
		}

	}

}
