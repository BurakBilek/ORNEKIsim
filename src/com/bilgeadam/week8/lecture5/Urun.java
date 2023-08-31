package com.bilgeadam.week8.lecture5;

public class Urun {
	/**
	 * urun sınıfı =>> isim, fiyat ve int son kullanma tarihi 2023, 2024;
	 * 
	 * UrunManager isimli bir sinif olusturalim. Bu sınıfta urunYarat isimli bir
	 * metot olsun, bu metot üzerinden Test sinifinda bir urun oluşturulım.
	 * 
	 * 
	 */

	private String isim;
	private int fiyat;
	private int sonkullanmatarihi;

	public Urun(String isim, int fiyat, int sonkullanmatarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonkullanmatarihi = sonkullanmatarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getSonkullanmatarihi() {
		return sonkullanmatarihi;
	}

	public void setSonkullanmatarihi(int sonkullanmatarihi) {
		this.sonkullanmatarihi = sonkullanmatarihi;
	}
}
