package com.bilgeadam.week2.lucture004;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*
		 * telefon kodu ve email kodu tanımlayacağız Kullanıcıdan e-mail ve telefon kodu
		 * girmesini isteyeceğiz. girilen sms kodu hatalı ise; Girdiğiniz sms kodu
		 * hatalıdır1".
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

		if (smsCode != smsInput) {
			System.out.println("sms kodunuz yanlış!");
		}
		if (emailCode != emailInput) {
			System.out.println("Email kodunuz yanlış");
		}
		if (smsCode == smsInput && emailCode == emailInput) {
			System.out.println("Başarıyla giriş yaptınız!");

		}
		scanner.close();
	}

}
