package com.bilgeadam.week9.lecture04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {
	/**
	 * Dışarıdan String olarak doğum günü alalım. Daha sonra doğduğunuz günden bu
	 * güne kadar; Kaç yıl Kaç ay Kaç hafta Kaç gün geçtiğini hesaplayip yazdıralım.
	 *
	 * Bir sonraki doğum gününüze kaç gün kaldığını hesaplayın.
	 *
	 * Ödev teslimi için ; DogumGunu sınıfını GitHub a pushlayın. Sonrasında
	 * DogumGunu sınıfına ait olan GitHub linkini ödev teslim olarak yollayın.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Günün tarihini giriniz");
		String gunString = sc.nextLine();
		int gun = Integer.parseInt(gunString);
		System.out.println("Ayın tarihini giriniz");
		String ayString = sc.nextLine();
		int ay = Integer.parseInt(ayString);
		System.out.println("Yılın tarihini giriniz");
		String yilString = sc.nextLine();
		int yil = Integer.parseInt(yilString);

		LocalDate now = LocalDate.now();
		LocalDate dogumtarihi = LocalDate.of(yil, ay, gun);
		System.out.println(dogumtarihi);

		System.out.println("Doğum Tarihiniz: " + dogumtarihi);
		long gunn = dogumtarihi.until(now, ChronoUnit.DAYS);
		System.out.println("Doğumunuzdan itibaren geçen gün: " + gun);

		long haftasi = dogumtarihi.until(now, ChronoUnit.WEEKS);
		System.out.println("Doğumunuzdan itibaren geçen hafta: " + haftasi);

		long ayi = dogumtarihi.until(now, ChronoUnit.MONTHS);
		System.out.println("Doğumunuzdan itibaren geçen ay: " + ayi);

		long yili = dogumtarihi.until(now, ChronoUnit.YEARS);
		System.out.println("Doğumunuzdan itibaren geçen yıl: " + yili);

		LocalDate nextBirthday = dogumtarihi.withYear(now.getYear());
		if (nextBirthday.isBefore(now) || nextBirthday.isEqual(now)) {
			nextBirthday = nextBirthday.plusYears(1);
		}
		long nextBirthdayDays = now.until(nextBirthday, ChronoUnit.DAYS);
		System.out.println("Bir Sonraki Doğum Gününe Kalan Gün: " + nextBirthdayDays);
	}

}