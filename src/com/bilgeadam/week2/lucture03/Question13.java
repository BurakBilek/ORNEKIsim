package com.bilgeadam.week2.lucture03;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {

		/*
		 * dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak, (2 üzeri 5
		 * gibi) tabanın luvvetini hesaplamak istiyorum. dışarıdan değer alınacaksa
		 * scanner kullanıcıya ismi sorulacak. Aldığım isim değişkeniyle birlikte sounuc
		 * yazdıracağım.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("lütfen taban değeri giriniz");
		int tabanDegeri = sc.nextInt();
		System.out.print("lütfen bir üs değeri giriniz");
		int us = sc.nextInt();

		int i = 1;
		int sonuc = 1;

		while (i <= us) {
			sonuc *= tabanDegeri;
			i++;
		}
		System.out.print("Lütfen isminizi girin");
		String isim = sc.nextLine();

		System.out.print(isim + " Girdiğin taban :" + tabanDegeri + " Girdiğin üs:" + us + " sonuc:" + sonuc);
	}

}
