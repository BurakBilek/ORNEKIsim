package com.bilgeadam.week2.lexture005;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// girilen sayının mükemmel sayı olup olmadığını bulan program mükemmel sayi
		// toplamları kendisini bölen kendisi hariç

		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi girişi yapınız");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= (sayi / 2); i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println("sayı mükemmel sayıdır.");
		} else {
			System.out.println("sayı mükemmel sayı değildir.");
		}

	}

}
