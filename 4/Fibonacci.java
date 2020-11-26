import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbę: ");
		int n = scanner.nextInt();
		System.out.println(String.format("Fibonacci(%d) = %d", n, fib(n)));
		scanner.close();
	}

	static long fib(int n) {
		if (n >= 0) {
			switch (n) {
				case 0: return 0;
				case 1: return 1;
				default: return fib(n-1) + fib(n-2);
			}
		}
		return -1;
	}

}
