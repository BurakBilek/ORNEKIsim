package com.bilgeadam.week2.lucture03;

import java.util.Scanner;

public class Question12 {

	/*
	 * 
	 * 
	 * girilen sayının basamakları toplamını ekrana yazdıralım
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int toplam = 0;
		int sayi;
		int sayac = 0;

		System.out.println("Lütfen bir sayı giriniz");

		sayi = sc.nextInt();

		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);

		System.out.println("basamaklar toplamı :" + toplam);
		System.out.println("basamak sayısı:" + sayac);
		sc.close();
	}

}
