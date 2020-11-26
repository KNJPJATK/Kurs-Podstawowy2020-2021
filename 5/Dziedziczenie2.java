interface InterfejsBazowy1 {
	
	void metoda1();
	
}

interface InterfejsBazowy2 {
	
	void metoda2();
	
}

interface InterfejsPochodny extends InterfejsBazowy1, InterfejsBazowy2{
	
	void metoda3();
	
}

class KlasaImplementujacaInterfejs implements InterfejsPochodny {
	
	@Override
	public void metoda1() {
		System.out.println("Metoda 1");
	}
	
	@Override
	public void metoda2() {
		System.out.println("Metoda 2");
	}
	
	@Override
	public void metoda3() {
		System.out.println("Metoda 3");
	}
	
}

public class Dziedziczenie2 {
	
	public static void main(String[] args) {
		KlasaImplementujacaInterfejs klasa = new KlasaImplementujacaInterfejs();
		klasa.metoda1();
		klasa.metoda2();
		klasa.metoda3();
	}
}