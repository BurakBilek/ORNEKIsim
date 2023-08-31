package metotlar.etüt;

import java.util.Scanner;

public class deneme {
	public static void m2147483647ain(String[] args) {

		/**
		 * girilen 6 adet sayıdan en büyük, en küçük olanı ve ortalamasını bulan kodu
		 * yazınız.
		 */
		Scanner sc = new Scanner(System.in);
		int[] sayilar = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + ". sayıyı gir.....: ");
			int sayi = sc.nextInt();
			sayilar[i] = sayi;
		}
		// -1
		int ebys = sayilar[0]; // {-1,-5,3,2,9,0}
		for (int i = 1; i < 6; i++)// i=1
			// -1 < -5
			if (ebys < sayilar[i])
				ebys = sayilar[i];

		System.out.println("En büyük sayı.....: " + ebys);// 9

		int enk = sayilar[0];
		for (int i = 1; i < 6; i++) {
			if (enk > sayilar[i])
				enk = sayilar[i];
		}

		System.out.println("En küçük sayı.....: " + enk);
	}
}
