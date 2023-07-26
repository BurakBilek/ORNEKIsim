package com.bilgeadam.week2.lucture004;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		/*
		 * 
		 * telefon kodu ve email kodu tanımlayacağız Kullanıcıdan e-mail ve telefon kodu
		 * girmesini isteyeceğiz. girilen sms kodu hatalı ise; Girdiğiniz sms kodu
		 * hatalıdır1" hem sms hem e mail kodu hatalıysa bir çıktı. sms doğru, email
		 * kodu yanlış ise farklı br çıktı . sms yanlış, email kodu doğru ies farklı bir
		 * çıktı . hepsi doğruysa "giriş yapınız".
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int smsCode = 444;
		int smsInput;
		int emailCode = 555;
		int emailInput;

		System.out.println("lutfen sms kodunuzu giriniz:");
		smsInput = scanner.nextInt();
		System.out.println("lutfen email kodunuzu giriniz:");
		emailInput = scanner.nextInt();

		if (smsCode != smsInput && emailCode == emailInput) {
			System.out.println("girdiğiniz sms kodu hatalıdır");
		} else if (smsCode == smsInput && emailCode != emailInput) {
			System.out.println("Girdiğiniz email kodu hatalıdır");
		} else if (smsCode != smsInput && emailCode != emailInput) {
			System.out.println("Girdiğiniz sms kodu ve email kodu hatalıdır.");
		} else
			System.out.println("sisteme başarı ile giriş yaptınız");

	}

}
