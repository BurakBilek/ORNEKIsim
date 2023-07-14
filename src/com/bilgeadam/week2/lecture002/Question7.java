package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question7 {

	/*
	 * Dışarıdan 2 tane sayısal değer alacağım. iki sayımın toplamı çift ise true,
	 * tek ise false yazdırıcam.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("lutfen ilk sayiyi giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.print("lütfen ikinci sayıyı giriniz:");
		sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;

		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;
		System.out.println(ortalama);
	}

}
