package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question6 {

	/*
	 * Dairenin alanını ve çervrewsini bulalım. yarı çap dışarıdan input olarak
	 * girilecek. alan = πr2 çevre = 2πr pi = 3.14
	 *
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Yarıcap Giriniz)");
		double yarıcap = scanner.nextDouble();

		double alan = pi * yarıcap * yarıcap;
		double cevre = 2 * pi * yarıcap;

		System.out.println("Alan =" + alan + "/nCevre =" + cevre);

		scanner.close();
	}

}
