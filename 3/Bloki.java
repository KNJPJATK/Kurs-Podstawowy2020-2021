public class Bloki {

	public static void main(String[] args) {
		int zmiennaGlobalna = 1;
		{
			// Nowy blok
			int zmiennaWBloku1 = 5;
			{
				// Blok wewnętrzny bloku 1
				System.out.println("zmiennaGlobalna = " + zmiennaGlobalna);
				System.out.println("ZmiennaWBloku1 = " + zmiennaWBloku1);
			}
		}
		{
			// Blok sąsiedni do bloku 1
			System.out.println("zmiennaGlobalna = " + zmiennaGlobalna);
			System.out.println("ZmiennaWBloku1 = " + zmiennaWBloku1);
		}
	}

}
