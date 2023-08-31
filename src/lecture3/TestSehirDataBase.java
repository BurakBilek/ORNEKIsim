package lecture3;

import java.util.Scanner;

public class TestSehirDataBase {
	/*
	 * 1- Dışarıdan girilen harfle başlayan illeri yazdır. 2- "01-Adana" formatında,
	 * illeri plaka kodları ile yazdıran method. 3-Girdiğimiz şehrin ismine göre
	 * plakasını dönen method.
	 * 
	 */
	public static void main(String[] args) {
		SehirDataBase sehirDB = new SehirDataBase();
		String[] iller = sehirDB.iller;

		harfleBaslayanIller(iller);
	}

	public static void harfleBaslayanIller(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir harf giriniz :");
		String harf = scanner.nextLine();

		for (int i = 0; i < iller.length; i++) {
			if (iller[i].startsWith(harf.toUpperCase().substring(0, 1))) {

			}
		}
	}

	public static void plakaYazdir
}
