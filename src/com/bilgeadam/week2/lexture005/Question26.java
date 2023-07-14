package com.bilgeadam.week2.lexture005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		/*
		 * dışarıdan bir String girdisi olsun. bu string' in her bir harfi bulubduğu
		 * index ile birlikte alt alta yazdıralım.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("yazı oluşturunuz:1");
		String yazi = sc.nextLine();

		for (int i = 0; i < yazi.length(); i++) {
			System.out.println(i + " " + yazi.charAt(i));
		}

	}

}
