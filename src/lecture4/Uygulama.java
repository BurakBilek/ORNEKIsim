package lecture4;

import java.util.Scanner;

public class Uygulama {
	/*
	 * 
	 * Menu; KULLANICI KAYIT SISTEMI******* 1- Kayıt ol 2- Giriş yap 3-
	 * Kullanıcıları göster 4- Çıkış
	 * 
	 * 
	 * 1- Menuyu olusturalım 2- Menuden secim yap 3- Yapilan secime gore aksiyon
	 * alinabilecek bir tema olustur.
	 * 
	 * * Case 1 kayitOl() metodunun içini yaz. kullaniciEkle() Case 1.1 * * Database
	 * sinifinda listeBoyutunuArtir(); =>>> liste.length-2 kadar veri barindirdigi
	 * zaman, listenin boyutunu 5 artirsin.
	 * 
	 */
	static Scanner sc = new Scanner(System.in);

	private void menu() {
		System.out.println("***Kullanıcı Giriş Paneli***");
		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
		System.out.println("3-Kullanıcıları Göster");
		System.out.println("4-Cıkıs");
	}

	private int secimYap() {
		System.out.println("Secim Yapınız");
		int secim = sc.nextInt();
		sc.nextLine();
		return secim;
	}

	public void kayitOl() {

		Kullanıcı kullanıcı = new Kullanıcı();

		System.out.println("Kullanıcıyı Adı Giriniz");
		kullanıcı.ad = sc.nextLine();
		System.out.println("Lutfen Mail Giriniz");
		kullanıcı.email = sc.nextLine();
		System.out.println("Lütfen Sifre Giriniz");
		kullanıcı.sifre = sc.nextLine();
		kullanıcı.id = DataBase.uzunluk + 1;
		DataBase.kullanıcıEkle(kullanıcı);

		System.out.println("Kayıt Olundu");

	}

	public void girisYap() {

		boolean user;
		int status = 0;
		do {
			System.out.print("E-mail Adresinizi Giriniz...:");
			String email = sc.nextLine();
			System.out.print("Şifre...");
			String sifre = sc.nextLine();

			if (DataBase.kullanıcıLİstesi == null) {
				System.err.println("Kullanıcı listesi bulunamadı.");
				return;
			}

			user = false;

			for (int i = 0; i < DataBase.kullanıcıLİstesi.length; i++) {
				if (DataBase.kullanıcıLİstesi[i] != null && DataBase.kullanıcıLİstesi[i].email.equals(email)) {
					user = true;
					if (DataBase.kullanıcıLİstesi[i].sifre.equals(sifre)) {
						System.out.println("Giriş Yapıldı.");
						status = 4;
						break;
					} else {
						System.out.println("Şifre Hatalı");
					}
				}
			}

			if (user = true) {
				System.out.println("Email Yada Kullanıcı Hatalı");
				status++;
				System.err.println("Kalan Deneme Hakkı: " + (3 - status));
			}

		} while (status < 3);

		if (status >= 3) {
			System.out.println("!!!!!!!!SUNUCUYA ERİŞİM YASAKLANDI!!!!!!!!!");
		}
	}

	public void kullanicilar() {
		for (int i = 0; i < DataBase.kullanıcıLİstesi.length; i++) {
			if (DataBase.kullanıcıLİstesi[i] != null) {
				System.out.println(DataBase.kullanıcıLİstesi[i].ad + " " + DataBase.kullanıcıLİstesi[i].email + " "
						+ DataBase.kullanıcıLİstesi[i].id);
			}
		}
	}

	public void application() {
		boolean check = true;
		do {
			menu();
			switch (secimYap()) {
			case 1: {
				kayitOl();

				// TODO kayıt ol methodunda verilerin giriş parametreleri belirnecek

				break;
			}
			case 2: {
				girisYap();
				break;
			}
			case 3: {
				kullanicilar();
				break;
			}
			case 4: {
				check = false;
				break;
			}

			default:
			}

		} while (check);
		System.out.println("Çıkış Yapıldı");

	}
}