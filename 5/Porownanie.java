public class Porownanie {
	
	public static void main(String[] args) {
		MojPierwszyEnum zmiennaEnum1 = MojPierwszyEnum.STALA;
		MojPierwszyEnum zmiennaEnum2 = MojPierwszyEnum.valueOf("STALA");
		
		String string1 = new String("Test porównywania");
		String string2 = new String("Test porównywania");
		
		System.out.println("Porównanie enumów: " + (zmiennaEnum1 == zmiennaEnum2));
		System.out.println("Porównanie napisów: " + (string1 == string2));
	}
	
	public static enum MojPierwszyEnum {
		
		STALA;
		
	}
	
}
