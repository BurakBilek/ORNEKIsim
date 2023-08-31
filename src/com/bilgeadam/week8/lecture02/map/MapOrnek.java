package com.bilgeadam.week8.lecture02.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bilgeadam.week8.lecture02.Ogrenci;

public class MapOrnek { // map eşleştirme anhtar gibi görev yapıyor eşleştirme tc kimlik

	public static void main(String[] args) {
		// String , Integer pair

		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		Map<Integer, Integer> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
		Map<Integer, Boolean> map5 = new HashMap<>();
		Map<String, List<String>> map6 = new HashMap<>();
		Map<String, Map<Integer, List<Integer>>> map7 = new HashMap<>();
		Map<Integer, Ogrenci> ogrenciMap = new HashMap<>();

		ogrenciMap.put(1, new Ogrenci(50, "Ugur"));
		ogrenciMap.put(2, new Ogrenci(25, "Alp"));
		ogrenciMap.put(3, new Ogrenci(10, "Burak"));
		ogrenciMap.put(4, new Ogrenci(70, "Mehmet"));

		System.out.println(ogrenciMap.get(2));
		System.out.println(ogrenciMap.containsKey(15));
		System.out.println(ogrenciMap.containsValue(ogrenci));

		// her bir liste bir anahtara ait

	}

}
