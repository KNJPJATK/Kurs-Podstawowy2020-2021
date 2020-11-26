public class Samochod {

	static final double POJEMNOSC_ZBIORNIKA_NA_PALIWO = 51.0;
	static final double SPALANIE_NA_100_KM = 4.4;

	long przebieg;
	double stanPaliwa;

	Samochod() {
		przebieg = 0;
		stanPaliwa = 0.0;
	}

	Samochod(long licznik, double paliwo) {
		przebieg = licznik;
		stanPaliwa = paliwo;
	}

	void tankuj(double paliwo) {
		if ((stanPaliwa + paliwo) <= POJEMNOSC_ZBIORNIKA_NA_PALIWO) {
			stanPaliwa += paliwo;
		} else {
			System.out.println("Zbyt duzo paliwa");
		}
	}

	void jedz(long odleglosc) {
		double potrzebnePaliwo = (odleglosc / 100) * SPALANIE_NA_100_KM;
		if (stanPaliwa - potrzebnePaliwo >= 0) {
			przebieg += odleglosc;
			stanPaliwa -= potrzebnePaliwo;
		} else {
			System.out.println("Nie wystarczy paliwa");
		}
	}

}
