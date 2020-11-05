public class PetlaDoWhile {

	public static void main(String[] args) {
		String[] tablica = {"Hello", "world", "!", "This", "is", "my", "awesome", "program", "!"};
		int i = 0;
		do {
			System.out.print(tablica[i] + " ");
			i++;
		} while (i < tablica.length);
		System.out.println();
	}

}
