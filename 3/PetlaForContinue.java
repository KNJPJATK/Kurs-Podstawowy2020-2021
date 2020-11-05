public class PetlaForContinue {

	public static void main(String[] args) {
		String[] tablica = {"Hello", "world", "!", "This", "is", "my", "awesome", "program", "!"};
		for (int i = 0; i < tablica.length; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(tablica[i] + " ");
		}
		System.out.println();
	}

}
