package com.bilgeadam.week2.lexture005;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 ile 100 arasında (0- 100 dahil) 5 adet sayıyı kullanıcıdan
		 * alacağımç aldığım sayılardan en büyük ve en küçük olanları yazdıran program.
		 * 
		 *
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (i <= 5) {
			System.out.println("Lütfen bir sayı giriniz");
			num = scanner.nextInt();

			if (num >= 0 && num <= 100) {

				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}

				i++;
			} else {
				System.err.println("lütfen geçerli bir sayı giriniz (0-100)");
			}
		}
		System.out.println("Max =" + max);
		System.out.println("min =" + min);
	}

}
