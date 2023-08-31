package week5.lecture003;

public class Calisan {
	private String isim;
	private String soyisim;
	private String unvan;
	private double maas;

	public Calisan(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;

	}

	public Calisan(String isim, String soyisim, String unvan, double maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.unvan = unvan;
		this.maas = maas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

}
