package lecture3;

public class Student {
	/**
	 * öğrencilerin isim ve numaraları olacak
	 * 
	 * her yeni öğrenci kaydedildiğinde öğrenci numarası 1 artacak.
	 */

	String isim; // nesne değişkeni
	static int numara; // sınıf değişkeni

	public void kayit() {
		numara += 1;
		System.out.println(isim + " adlı öğrenci " + numara + " no su ile kaydolmuştur. ");
	}

	public static void tenefuseCik() {
		System.out.println("Ogrenciler tenefüse çıktı");
	}

}
