package com.bilgeadam.week3.leture001;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dizideki bütün sayıların toplamını yazdıralım.
		// dizinin her bir elemanı için;
			//çift ise çifttir, tek ise tektir yazdıralım.
		//int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14}
		Scanner sc = new Scanner(System.in);
	          
		int sayilar[] = { 0, 120, 5, 85, -256, 16 ,1258, 81,14 };
		
		int toplam = 0;
		
		for (int i =0;   i<sayilar.length; i++)  {
			
			toplam += sayilar[i]
		}
		
	}

}
