package com.bilgeadam.week2.lexture005;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// dışarıdan bir değer alıcağız, bu aldığımız değerin içerisinde
		// kaç tane "a" harfi olduğunu bize döndürecek program

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		String deger = sc.nextLine();

		String kucuk = deger.toLowerCase();
		int j = 0;
		for (int i = 0; i < kucuk.length() - 1; i++) {
			if (kucuk.charAt(i) == 'a')
				;
			{
				j++;
			}
		}
		System.out.println(j);
	}

}
