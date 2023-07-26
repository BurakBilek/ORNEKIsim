package com.bilgeadam.week4.lecture003;

public class Question50 {
	/*
	 * 
	 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	 * 
	 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini
	 * yazdıralım.
	 */
	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		tekrarEdenSay(dizi);
		/**
		 * System.out.println(1 + "Sayisi 3 kere tekrar ediyor."); System.out.println(5
		 * + "Sayisi 2 kere tekrar ediyor."); System.out.println(9 + "Sayisi 2 kere
		 * tekrar ediyor."); System.out.println(8 + "Sayisi 1 kere tekrar ediyor.");
		 * System.out.println(0 + "Sayisi 2 kere tekrar ediyor.");
		 */
	}

	public static void tekrarEdenSay(int[] array) {
		boolean[] kontrol = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {

			if (kontrol[i] == true) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					kontrol[j] = true;
				}

			}
			System.out.println(array[i] + "sayısı," + count + " adet bulunmaktadır.");
		}

	}
}
