package metotlar.etüt;

public class Question2 {
	/**
	 * int[] alperen = {5,10,25,10,500,1000} int[] muhammet = {10,15,1000,300,1200}
	 * int[] ugurcan = {2000} * 2000 tl ve üzeri sepet tutarına ulaşanlara %10
	 * indirim. 2500 tl ve üzeri sepet tutarına ulaşanlara %12.5 indirim. sepetinde
	 * 1000 tl ve üzeri ve 5 üründen fazla ürün olan kullanıcılara ekstra %5 indirim
	 */

	public static void main(String[] args) {

		int[] alperen = { 5, 10, 25, 10, 500, 1000 }; // {1550,6}
		int[] muhammet = { 10, 15, 1000, 300, 1200 };
		int[] ugurcan = { 2000 };

		// int[] alperenPriceAndQuantity = calculatePriceAndQuantity(alperen);
		// int[] muhammetPriceAndQuantity = calculatePriceAndQuantity(muhammet);
		// int[] ugurcanPriceAndQuantity = calculatePriceAndQuantity(ugurcan);

		// System.out.println(calculatePriceAndQuantity(alperen));

		System.out.println(discountOverCartPrice(calculatePriceAndQuantity(muhammet)));
	}

	public static int[] calculatePriceAndQuantity(int[] cart) {

		// 2000 tl ve üzeri sepet tutarına ulaşanlara %10
		// * indirim. 2500 tl ve üzeri sepet tutarına ulaşanlara %12.5 indirim
		int price = 0;
		int quantity = cart.length;
		int[] priceAndQuantity = new int[2];
		for (int i = 0; i < cart.length; i++) {
			price += cart[i]; // toplam = toplam + cart[i];

		}
		priceAndQuantity[0] = price;
		priceAndQuantity[1] = quantity;

		return priceAndQuantity;
	}

	public static double discountOverCartPrice(int[] priceAndQuantities) {
		double discountRatio;
		if (priceAndQuantities[0] >= 2500) {
			discountRatio = 0.125; // discountRatio = discountRatio + 10 // discountRatio = 0.10

		} else if (priceAndQuantities[0] >= 2000) {
			discountRatio = 0.10;
		} else {
			discountRatio = 0;
		}
		return priceAndQuantities[0] * discountRatio;
	}
	// sepetinde
	// * 1000 tl ve üzeri ve 5 üründen fazla ürün olan kullanıcılara ekstra %5
	// indirim

	public static double discountOverQuantities(int[] priceAndQuantites) {
		double discountRatio;
		if(priceAndQuantites [0] >= 1000 && priceAndQuantites[1] >=5)  {
			discountRatio = 0.05;
		} else {
			discountRatio = 0;
		}
		return discountRatio * priceAndQuantites[0];
	}

	public static double discountedCartPrice(int cartPrice, double discountOverPrice, double discountOver)
	
}
