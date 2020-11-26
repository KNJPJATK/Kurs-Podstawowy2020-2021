public class PubliczneNiepubliczne {
	
	public static void main(String[] args) {
		KlasaWewnetrzna klasaWewnetrzna = new KlasaWewnetrzna();
		DrugaKlasaWTymSamymPliku drugaKlasaWTymSamymPliku = new DrugaKlasaWTymSamymPliku();
		
		klasaWewnetrzna.wypisz();
		drugaKlasaWTymSamymPliku.wypisz();
	}
	
	public static class KlasaWewnetrzna {
		
		public void wypisz() {
			System.out.println("Cześć! Jestem statyczną klasą wewnętrzną");
		}
		
	}
	
}

class DrugaKlasaWTymSamymPliku {
	
	public void wypisz() {
		System.out.println("Cześć! Jestem zwykłą klasą, tyle że niepubliczną");
	}
	
}
