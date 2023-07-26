package com.bilgeadam.week3.lecture005;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		// Benim çözdüğüm soru (derste)
		// Bir metot olsun, metodun içine 2 tane sayı alalım. Bu sayıları çarpıp çarpım
		// değerini döndürelim.

		// main metodumda bir sayı değeri olacak sayi=15, bir de sonuc değeri olacak
		// sonuc=0;
		// aşağıda oluşturduğum metotlardan dönen değerleri sonuc = sayi/"metot"
		// işleminde kullanmak istiyorum.

		// yeni bir carpim metodu oluşturalım, iki adet sayıyı dışarıdan alan bir metot
		// oluşturalım. Bu metot 2 sayıyı geri dönsün.

		// Sonra yeni oluşturduğumuz çarpım metodunda iki adet sayı alan metodumuzu
		// kullanarak aynı işlemleri gerçekleştirelim.

		System.out.println("sonuc " + carpim(10, 24));

		System.out.println("sonuc: " + multiplyTwoNumbers());

		int number = 15;
		double result3 = 0;
		result3 = (double) number / multiplyTwoNumbers();
		if (result3)
			System.out.println("Result = " + result3);

	}

	public static int multiplyTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("birinci sayiyi  giriniz ");
		int sayi1 = sc.nextInt();
		System.out.print("ikinci sayiyi giriniz  ");
		int sayi2 = sc.nextInt();

		return sayi1 * sayi2;

	}

	public static int carpim(int sayi1, int sayi2) {

		return sayi1 * sayi2;
	}
}
