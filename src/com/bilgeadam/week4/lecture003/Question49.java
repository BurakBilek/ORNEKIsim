package com.bilgeadam.week4.lecture003;

import java.util.Scanner;

public class Question49 {
	/*
	 * lütfen tek bir sayı giriniz : 7 lütfen sütun sayısını giriniz: 4 lütfen satır
	 * sayısını giriniz: 4
	 * 
	 * 4777 1477 1147 1114
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir tek sayı giriniz : ");
		int sayi = scanner.nextInt();
		System.out.println("lütfen  satır sayısı giriniz : ");
		int satir = scanner.nextInt();
		System.out.println("lütfen sütun sayısı giriniz : ");
		int sutun = scanner.nextInt();

		printArray(7, 4, 4);
	}

	public static void printArray(int max, int satir, int sutun) {

		int min = 1;
		int orta = (max + min) / 2;
		int[][] array = new int[satir][sutun];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; i < array.length; i++) {
				System.out.println(array[i][j]);

			}
			System.out.println();

		}

	}

}
