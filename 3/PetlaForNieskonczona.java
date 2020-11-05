public class PetlaForNieskonczona {

	public static void main(String[] args) {
		String[] tablica = {"Hello", "world", "!", "This", "is", "my", "awesome", "program", "!"};
		for (int i = (tablica.length - 1); i < tablica.length; i--) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println();
	}

}
