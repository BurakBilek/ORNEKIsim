package com.bilgeadam.week8.lecture4;

import java.util.HashMap;
import java.util.Map;

public class SansliNumaralar {
	/*
	 * 
	 * 1 ile 100 arasinda rastgele, 10.000 adet sayi uretecegiz.
	 * 
	 * 1- sayiOlustur metodu ile rastgele olusturdugumuz sayilari bir map'e
	 * atacagiz. Sayinin kac kere tekrar ettigini tutacagiz. key = sayi , value =
	 * tekrar sayisi.
	 * 
	 * 2- mapde gezinirken listeye ekleme yapacagiz. Her eleman ne kadar tekrar
	 * ediyor ise, o kadar kez listeye eklenecek.
	 * 
	 * 
	 * 3- En son olusturdugumuz listeden rastgele 10 adet deger alacagiz ve bu
	 * aldigimiz degerleri bir sete ekleyecegiz. Bu isleme gecmeden once listemizi
	 * karistiralim. Collections.shuffle(); sansliNumaralariBul();
	 * 
	 * optional -> null pointerlardan kaçan
	 */
	static final int maxSayi = 100;
	static final int uretilenSayiMiktari = 10000;

	Map<Integer, Integer> sayilarMap = new HashMap();
	Map<Integer, Integer> listeMap = new HashMap();

	private int sayiOlustur() {
		return Utility.randomSayiUret(1, maxSayi + 1);
	}

	public void mapOlustur() {
		for (int i = 0; i < uretilenSayiMiktari; i++) {
			int sayi = sayiOlustur();
			if (sayilarMap.containsKey(sayi)) {
				sayilarMap.put(sayi, sayilarMap.get(sayi) + 1);
			} else {
				sayilarMap.put(sayi, 1);
			}
		}
	}

	public void listeOlustur() {
		for (int i = 0; i < uretilenSayiMiktari; i++) {

		}
	}

}
