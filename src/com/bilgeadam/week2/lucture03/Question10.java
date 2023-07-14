package com.bilgeadam.week2.lucture03;

import java.util.Scanner;

public class Question10 {

	/*
	 * 1'de başlayarak kullanıcının dışarıdan girdiği sayıya kadar olan (sayı dahil)
	 * sayıların 1 fazlasının toplamını ekranda yazdıran program
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi; i++) {
			toplam += (i + 1);
		}
		System.out.println(toplam);

		// while ile
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("lüfen bir sayı giriniz");
		 * 
		 * 
		 */
	}

}
