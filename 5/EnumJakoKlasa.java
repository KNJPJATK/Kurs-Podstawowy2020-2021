public class EnumJakoKlasa {
	
	public static void main(String[] args) {
		MojPierwszyEnum.STALA_1.wypisz();
		MojPierwszyEnum.STALA_2.wypisz();
	}
	
	public static enum MojPierwszyEnum {
		
		STALA_1("Wartość dla stałej 1"), STALA_2("Wartość dla stałej 2");
		
		private String mojePole;
		
		private MojPierwszyEnum(String wartosc) {
			mojePole = wartosc;
		}
		
		public void wypisz() {
			System.out.println(this + ": " + mojePole);
		}
		
	}
	
}
