package com.bilgeadam.week4.lecture002;

import java.util.Random;

public class Uygulama {

	public static void main(String[] args) {
		TasKagitMakas tkm = new TasKagitMakas();
		String[] array = tkm.tasKagitMakas;

		uygulama(array);

		Random random = new Random();
		int sayi = random.nextInt(1, 4);
		System.out.println(sayi);

	}

	public static void uygulama(String[] args)  {
	//tas- kağıt
	//tas- makas
	//kağıt-makas

}
