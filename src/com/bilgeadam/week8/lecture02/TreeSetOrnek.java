package com.bilgeadam.week8.lecture02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {

	/*
	 * 
	 * klavyeden rastgele 10 tane sayi alip bunlarin ciktisini ver.
	 * 
	 * 
	 */

	static Scanner scanner;
	static Set<Integer> sayilar = new HashSet<>(); // karisik bir şekilde
	static Set<Integer> ekledigimSiraile = new LinkedHashSet<>();
	static Set<Integer> kucuktenBuyuge = new TreeSet<>();// girilen verileri sıralı bir şekilde döner
	static Set<Ogrenci> ogrenciSet = new TreeSet<>();//

	public static void main(String[] args) {
	//	sayiEkle();
//		yazdir(sayilar);
	//	System.out.println();
	//	yazdir(ekledigimSiraile);
	//	System.out.println();
	//	yazdir(kucuktenBuyuge);
		
		ogrenciSet.add
	}

	public static void sayiEkle() {
		scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Lutfen bir sayi giriniz : ");
			int sayi = scanner.nextInt();
			sayilar.add(sayi);
		}
	}

	public static void yazdir(Set<Integer> set) {
		set.forEach(System.out::println);
	}

}
