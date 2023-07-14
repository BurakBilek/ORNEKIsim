package com.bilgeadam.week2.lucture004;

public class Question16 {

	public static void main(String[] args) {
		// 0-100 arası çift sayıların tek sayılara oranı

		double tekToplam = 0, ciftToplam = 0;
		/*
		 * for (int i = 1; i <= 100; i++) { if (i % 2 == 0) { ciftToplam += i; } else {
		 * tekToplam += i; }
		 */

		for (

				double i = 1; i <= 100; i += 2) {
			tekToplam += i;
			ciftToplam += i + 1;
		}
		double oran = ciftToplam / tekToplam;

		System.out.println("cift sayı toplamının, tek sayı toplamına oranı:" + oran);

	}

}
