package com.bilgeadam.week9.lecture04;

import java.time.LocalDate;
import java.util.Scanner;

public class DateOrnek {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		System.out.println(date1); // YIL- AY-GÜN
		LocalDate date2 = LocalDate.of(2023, 12, 10);
		System.out.println(date2);

		// System.out.println(date2.plusDays(25));
		// System.out.println(date2.plusMonths(2));
		// System.out.println(date2.plusWeeks(8));
		// System.out.println(date2.plusYears(2));
		// System.out.println(date2.minusDays(5));
		// System.out.println("Yil : " + date2.getYear());
		// System.out.println("Ay : " + date2.getMonthValue());
		// System.out.println("Gün : " + date2.getDayOfMonth());
		// System.out.println("Yılın kaçıncı günü : " + date2.getDayOfYear());
		// System.out.println("Günün adi : " + date2.getDayOfWeek());
		// System.out.println(date1.isBefore(date2));
		// System.out.println(date1.isAfter(date2));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yıl giriniz : ");
		int yil = scanner.nextInt();
		System.out.println("Lütfen ay giriniz : ");
		int ay = scanner.nextInt();
		System.out.println("lÜTFEN GÜN GİRİNİZ :");
		int gün = scanner.nextInt();

		LocalDate date3 = LocalDate.of(yil, ay, gün);
		System.out.println(date3);

		LocalDate date4 = LocalDate.parse("2023-12-10");
		System.out.println(date4);

		LocalDate date5 = LocalDate.parse(scanner.nextLine());
		System.out.println(date5);

	}

}
