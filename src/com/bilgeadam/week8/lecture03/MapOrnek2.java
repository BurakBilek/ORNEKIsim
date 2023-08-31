package com.bilgeadam.week8.lecture03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {
	Map<String, Integer> sinif = new HashMap<String, Integer>();
	String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
	int[] notlar = { 60, 70, 80 };
	Map<String, Map<String, Integer>> sinif2 = new HashMap<String, Map<String, Integer>>();
	int[][] notlar2 = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } };// mapolustur2 metodu ve yine mapi yazdiralim

	public static void main(String[] args) {

		/*
		 * Ogrenci ve notlardan olusan bir map olusturalım
		 * 
		 * ogrenciyi cagirdigimda bana notlari dönsün mapi yazdiralim
		 * 
		 */

//		Map<String, Integer> map = new HashMap<>();
//		map.put("Ayse", 60);
//		map.put("Ece", 70);
//		map.put("Mahmut", 80);
//		for (Entry<String, Integer> ogrenciler : map.entrySet()) {
//			System.out.println(ogrenciler.getKey());
//			System.out.println(ogrenciler.getValue());
//		}

		MapOrnek2 mapOrnek2 = new MapOrnek2();

		mapOrnek2.mapOlustur1();
		mapOrnek2.mapYazdir();
	}

	public void mapOlustur1() {
		for (int i = 0; i < ogrenci.length; i++) {
			sinif.put(ogrenci[i], notlar[i]);
		}
	}

	public void mapYazdir() {
		for (Entry<String, Integer> ogrencilerVeNotlari : sinif.entrySet()) {
			System.out.println(ogrencilerVeNotlari.getKey() + " =>> " + ogrencilerVeNotlari.getValue());
		}
	}

}
