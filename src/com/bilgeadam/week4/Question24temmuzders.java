package com.bilgeadam.week4;

import java.util.Scanner;

public class Question24temmuzders {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static String toplama_islemi(int[] numbers) {

		int sonuc = numbers[0] + numbers[1];
		return "Sonuc: " + sonuc;
	}

	public static String cikarma_islemi(int[] numbers) {
		int sonuc = numbers[0] - numbers[1];
		return "Sonuc: " + sonuc;
	}

	public static String carpma_islemi(int[] numbers) {
		int sonuc = numbers[0] * numbers[1];
		return "Sonuc: " + sonuc;
	}

	public static String bolme_islemi(int[] numbers) {
		if (numbers[1] == 0) {
			System.out.println("Sıfır girdiniz");
			return "Sonuc Tanımsız";
		}

		double sonuc = (double) numbers[0] / numbers[1];
		return "Sonuc: " + sonuc;
	}

	public static String mod_islemi(int[] numbers) {
		int sonuc = numbers[0] % numbers[1];
		return "Sonuc: " + sonuc;
	}

	public static int secimYap() {
		System.out.println("Seciminiz: ");
		int secim = sc.nextInt();
		return secim;

	}

	public static int[] ikiSayiAl() {

		int[] numbers = new int[2];

		System.out.print("Lutfen birinci sayiyi giriniz: ");
		numbers[0] = sc.nextInt();
		System.out.print("Lutfen ikinci sayiyi giriniz: ");
		numbers[1] = sc.nextInt();
		return numbers;

	}

}
