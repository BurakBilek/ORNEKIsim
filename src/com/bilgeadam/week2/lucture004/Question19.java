package com.bilgeadam.week2.lucture004;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		/*
		 *Girilen Sayının Asal Olup Olmadığını bulan ve buna çıktı veren program 
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("sayı girişi yapınız");
             int sayi = scanner.nextInt();
             System.out.println();
		int sayac ;
		if (sayi %2 == 0) {
			System.out.println("Asal Sayidir");
		} else if (sayi % 2 ==  0 || sayi == 1) {
			System.out.println("sayi asal değildir");
		} else {
		 for (sayac = 3; sayac <= sayi; sayac += 2) {
			 if (sayi == sayac) {
				 System.out.println("asaldır");
			 }
		 }
		
		
	}

}
