package com.bilgeadam.week2.lucture03;

import java.util.Scanner;

public class Question9 {

	/*
	 * 
	 * kullanıcıdan girilen 1-10 arasındaki sayınıın çarpım tablosu yapalım
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz");
		int sayi = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + i + "=" + carpim);

		}

	}

}
