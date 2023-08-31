package com.bilgeadam.week8.lecture4;

public class Test {

	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();

		sansliNumaralar.mapOlustur();
		sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + " = " + v));
	}

}
