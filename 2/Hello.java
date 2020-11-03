import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.print("Podaj swoje imię: ");
		Scanner scanner = new Scanner(System.in);
		int imie = scanner.nextInt();
		String s1 = "Witaj ";
		String s2 = "!";
		String result = s1 + imie + s2;
		System.out.println(result);
	}

}