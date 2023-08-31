package metotlar.etüt;

public class Question1 {

	public static void main(String[] args) {

		int[] ali = { 15, 20, 8, 50, 30 };
		int[] veli = { 5, 15 };
		int[] ayse = { 100, 50, 10, 15, 20, 30, 50 };

		int total = 0;
		////////////
		for (int i = 0; i < ali.length; i++) {

			total += ali[i];
		}

		System.out.println(total);
		total = 0;

		///////
		for (int i = 0; i < veli.length; i++) {
			total += veli[i];
		}
		System.out.println(total);
		total = 0;
	}

}
