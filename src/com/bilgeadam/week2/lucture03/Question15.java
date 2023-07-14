package com.bilgeadam.week2.lucture03;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		/*
		 * klavyeden sıfır girilinceye kadarsayı okumaya devam edeceğiz. 0 girildiğinde
		 * sayıların toplamını ve ortalamasını erkana yazdıralım
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayac = 1;
		double ortalama = 0;
		System.out.println("Lütfen sayı Girişi Yapınız");
		int number = scanner.nextInt();

		for (sayac = 1; number != 0; sayac++) {
			toplam += number;
			ortalama = (double) toplam / (sayac++);
			System.out.println("Sayı Girişi Yapınız");
			number = scanner.nextInt();
		}
		System.out.println("Toplam kısmınız:" + toplam + "/nortalamanız:" + ortalama);
		scanner.close();

	}

}
