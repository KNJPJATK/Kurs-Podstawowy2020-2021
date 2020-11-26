public class SamochodInstancja {

	public static void main(String[] args) {
		Samochod samochod = new Samochod();
		samochod.tankuj(10.0);
		samochod.jedz(250);
		System.out.println(String.format("Samochod {\n\tprzebieg = %d\n\tstanPaliwa = %.2f\n}", samochod.przebieg, samochod.stanPaliwa));
	}

}
