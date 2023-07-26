package com.bilgeadam.week2.lexture005;

public class Question28 {

	/*
	 * Java React Spring
	 * 
	 * split kullanmadan virgülden bölüp
	 * 
	 * bir for döngüsünün içinde Java React Spring
	 */

	public static void main(String[] args) {

		String deger = "Java,React,Spring";

		int index = 0;

		for (int i = 0; i < deger.length(); i++) {

			if (deger.charAt(i) == ',') {
				System.out.println(deger.substring(index, i));
				index = i + 1;
			}
		}

		System.out.println(deger.substring(index));
		System.out.println("///////////");
	}

}
