package com.bilgeadam.week8.lecture02;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {
	/*
	 * 
	 * Film kategorileri.
	 * 
	 * Bir tane String setimiz olsun. Daha sonra disaridan bir kategori istedigimiz
	 * metot olsun ve bu kategorileri setimize ekleyelim.
	 * 
	 * Eger daha once eklemissek bize bu kategori daha once eklenmis gibi bir cikti
	 * versin, daha once eklenmediyse de kategori basariyla eklendi gibi bir cikti
	 * versin.
	 * 
	 * setimizi yazdiralim
	 * 
	 */

	public static void main(String[] args) {
		// Set<Integer> integerSet = new HashSet<>();
		// integerSet.add(10);
		// integerSet.add(20);
		// integerSet.add(10);

		// integerSet.forEach(System.out::println);

		Set<String> set = new HashSet<>();
		kategoriEkle("Aksiyon", set);
		kategoriEkle("Romantik", set);
		kategoriEkle("Dram", set);
		kategoriEkle("Aksiyon", set);

		for (String kategori : set) {
			System.out.println(kategori);
		}

	}

	public static void kategoriEkle(String kategori, Set<String> set) {
		if (set.contains(kategori)) {
			System.out.println(kategori + "kategorisi daha önce eklenmiştir.");
		} else {
			System.out.println(kategori + "basarılı bir şekilde  eklenmiştir");
			set.add(kategori);
		}

	}

}
