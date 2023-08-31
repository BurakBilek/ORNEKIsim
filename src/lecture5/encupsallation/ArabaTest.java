package lecture5.encupsallation;

public class ArabaTest {
	Araba araba = new Araba();
	araba.marka = "bmw";
	araba.model = "x5";
	araba.km = 0;
	araba.bijonSayisi = 5;
	araba.camSil = "a";

	araba.ozellikleriYazdir();
	araba.arabayiSur();
	
	//################
	Araba araba2 = new Araba("bmw", "x5", -150, 5, "a");

	araba2.arabayiSur();
	araba2.ozellikleriYazdir();

}
