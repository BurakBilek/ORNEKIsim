package com.bilgeadam.week2.lecture002;

public class Question4 {
	/*
	 * 
	 * iki tane string değişken oluşturalım.İsim ve soyisim olsun. Sonra bu
	 * değişkenleri bir şekilde ekrana yazdıralım.
	 * 
	 * 
	 * A VE B DEĞERLERİNİN ASCİİ DEĞERLERİ?
	 * 
	 */

	public static void main(String[] args) {
		String isim = "Burak";
		String soyisim = "Bilek";
		String İsimSoyisim = "isim: " + isim + ", soyisim: " + soyisim;

		System.out.println(İsimSoyisim);

		// System.out.println();
		// System.out.println();
		System.out.println("####");
		System.out.println("isim:" + isim + "/nsoyisim: " + soyisim);

		// ctrl + shift + 7
		char a = 'a';
		char b = 'b';
		System.out.println("ASCII a: " + (int) a + "/nASCII b: " + (int) b);
		System.out.println(a + b);

	}

}
