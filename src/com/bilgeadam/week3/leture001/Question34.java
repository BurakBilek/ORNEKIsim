package com.bilgeadam.week3.leture001;

public class Question34 {

	public static void main(String[] args) {
		/*
		 * 
		 * int [] sayilar={1,4,5,6,1,1,4,8};
		 * 
		 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
		 * adetinden büyükse true değilse false
		 * 
		 */

		int [] sayilar={1,4,5,6,1,1,4,8};
		int j = 0;
		int k = 0;
		boolean kontrol = true;
		
		for(int i=0; i<sayilar.length; i++)  {
			
			if (sayilar[i] == 1) {
				j++;
			}else if (sayilar[i]==4)  {
				k++;
			}
		}
		System.out.println(k+j);
		System.out.println("1 sayısı "+j+" adet var."+"/n4 sayısı "+k+ adet var./n);
	}

}
