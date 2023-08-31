package com.bilgeadam.week8.lecture03;

public class PlakaTahmin {
	/*
	 * 
	 * -bu arrayden bir map olusturan metodu yazalim key degerleri plaka degerleri
	 * olsun value sehir olsun. 1,2,3
	 * 
	 * oyun sayisi hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz
	 * 
	 * menumuz olacak
	 * 
	 * Sehir tahmin oyununa hosgeldiniz Her oyun icin 3 tahmin hakkiniz
	 * bulunmaktadir.
	 * 
	 * 1-oyuna basla
	 * 
	 * 1.oyun (kacıncı oyundaysak) 3 tahmin hakkimiz var(herdefasinda azalacak)
	 * 
	 * Random bir plaka uretecegiz (utility sinifinda yapalim) ve kullaniciya soru
	 * soracagiz bu plaka hangi ile aittir? kullanicidan gelen degere gore islem
	 * yapacagiz dogruysa bildiniz, yanlissa tekrar deneyin ciktisini verip basa
	 * donecegiz (toplamda 3 tahmin hakkimiz bulunmaktadir.) basarili tahminde
	 * bulundugumuz zaman ve tahmin hakkimiz kalmadigi zaman ana menuye donsun
	 * 
	 * 
	 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim her oyunun tahminlerini
	 * bir yerde tutacagım sonra burayı cagirdigim zaman her oyunun tahminleri ayri
	 * ayri yazilsin
	 * 
	 * 3- cikis
	 * 
	 * 
	 * 
	 */

	String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	Map<Integer, String[]> plakalar = new HashMap<Integer, String>[]>();

	public void mapOlustur(Map<Integer, String> plakalar, String[] iller) {
		for (int i = 0; i < iller.length; i++) {
			plakalar.put((i + 1), iller[i]);
		}
	}

	public static void main(String[] args) {

	}

}
