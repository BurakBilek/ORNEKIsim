package com.bilgeadam.week4.lecture002;

import java.util.Scanner;

public class Question46 {
	// Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

	// 2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

	// eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri
	// metoda geçelim.

	// main'de dışarıdan kaç sayı alacağımızı belirliyoruz, o sayılara göre
	// koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan birisini
	// çağıracağız.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen sayı adedi giriniz :");
		int sayiAdedi = scanner.nextInt();

		switch (sayiAdedi) {

		case 2:
			System.out.println("Toplam = " + topla());

		}

	}

	private static int topla() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen 1. sayıyı giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("lütfen 2. sayıyı giriniz");
		int sayi2 = scanner.nextInt();

	}

}
