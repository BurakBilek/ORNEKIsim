package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question8 {

	// dışarıdan girilen bir sayının faktoriyelini bulalım

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("lütfen bir sayı giriniz: ");
		int sayi1 = sc.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= sayi1; i++) {

			faktoriyel = faktoriyel * i;
		}
		System.out.println(faktoriyel);
	}

}
