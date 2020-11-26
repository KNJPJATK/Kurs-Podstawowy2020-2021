public class TworzenieObiektow {
	
	public static void main(String[] args) {
		KlasaZewnetrzna klasaZewnetrzna = new KlasaZewnetrzna();
		
		KlasaZewnetrzna.KlasaWewnetrzna klasaWewnetrzna = klasaZewnetrzna.new KlasaWewnetrzna();
		KlasaZewnetrzna.StatycznaKlasaWewnetrzna statycznaKlasaWewnetrzna = new KlasaZewnetrzna.StatycznaKlasaWewnetrzna();
		
		System.out.println(klasaWewnetrzna);
		System.out.println(statycznaKlasaWewnetrzna);
	}
	
}

class KlasaZewnetrzna {
	
	public class KlasaWewnetrzna {
		
	}
	
	public static class StatycznaKlasaWewnetrzna {
		
	}
	
}
