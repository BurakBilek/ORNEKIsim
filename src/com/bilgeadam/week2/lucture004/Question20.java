package com.bilgeadam.week2.lucture004;

import java.util.Scanner;

// bu tam olmadı yanlış sonuc veiyor kontrol et
public class Question20 {

	public static void main(String[] args) {
		// girilen sayının 5'in kuvveti olup olmadığını bulan program.

		Scanner scanner = new Scanner(System.in);
		System.out.println("sayınızı giriniz");
		int sayi = scanner.nextInt();
		boolean kontrol = true;

		if (sayi == 1) {
			System.out.println("sayı 5 in kuvvetidir");
			kontrol = false;
			System.out.println("Kontrol = False"); //
		}

		else if (sayi < 0) {
			System.out.println("lütfen pozitif sayı giriniz");
			kontrol = false;
			System.out.println("Kontrol = False"); //
		}
		System.out.println("Döngü girişi"); //
		while (kontrol) {
			System.out.println("Döngüye girdik");
			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("sayi 5 in kuvvetidir");
					kontrol = false;
					System.out.println("Kontrol = False"); //
				}

			} else {
				System.out.println("sayı 5 in kuvveti değildir");
				kontrol = false;
				System.out.println("Kontrol = False"); //
			}

		}
		System.out.println("Döngü Çıkışı"); //
		scanner.close();
	}

}
