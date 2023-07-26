package com.bilgeadam.week2.lucture004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// kullanıcı 1 ile 7 arasında bir sayı girsin
		// bu sayıya denk gelen haftanın gününü yazdıralım. (1 pazartesi)

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen 1 iel 7 arasında bir sayı giriniz");
		int sayi = scanner.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("pazartesi");
			break;

		case 2:
			System.out.println("salı");
			break;

		case 3:
			System.out.println("çarşamba");
			break;

		case 4:
			System.out.println("perşembe");
			break;

		case 5:
			System.out.println("cuma");
			break;

		case 6:
			System.out.println("cumartesi");
			break;

		case 7:
			System.out.println("pazar");
			break;

		default:
			System.err.println("lütfen geçerli bir değer giriniz");
		}
		scanner.close();

	}

}
