package com.bilgeadam.week3.leture001;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		/*
		 * 
		 * Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
		 * 
		 * 
		 * Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		String[] ulkeler = { "Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };

		System.out.println("Lütfen bir ülke adı giriniz : ");
		String ulke = scanner.nextLine();

		for (int i = 0; i < ulkeler.length; i++) {
			if (ulkeler[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke dizimizde bulunmaktadır.");
				break;

			} else if (i == ulkeler.length - 1) {
				System.err.println("Girdiğiniz ülke diziizde bulunmaktadır.");

			}

		}

	}

}
