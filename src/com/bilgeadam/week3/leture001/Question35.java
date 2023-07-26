package com.bilgeadam.week3.leture001;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bir dizide 13 var ise 13 ve bir sonra ki
		// eleman toplama eklenmeden toplam souncu bulan kod
		// 1, 13, 13, 13, 5, 1

		// dizide 13 sayısına denk gelene kadar devam edelim.
		// 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise.
		// 13'den sonra gelen sayıyı toplama ekleyelim

		int nums[] = { 1, 13, 13, 13, 5, 1 };
		int toplam = 0;
		for (int i = 0; i < nums.length; i++) {
			toplam += nums[i];
			if (nums[i] == 13 && nums[i] == nums[i + 1]) {
				toplam -= nums[i];
			}
		}
		System.out.println(toplam);
	}

}
