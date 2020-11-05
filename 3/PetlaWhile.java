public class PetlaWhile {

	public static void main(String[] args) {
		String[] tablica = {"Hello", "world", "!", "This", "is", "my", "awesome", "program", "!"};
		int i = 0;
		while (i < tablica.length) {
			System.out.print(tablica[i] + " ");
			i++;
		}
		System.out.println();
	}

}
