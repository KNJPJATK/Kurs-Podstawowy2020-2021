public class Funkcje {

	public static void main(String[] args) {
		int sum = suma(2, 3);
		System.out.println(sum);
		System.out.println(suma(1, 1));
		System.out.println(suma(1, 2));
		System.out.println(suma(2, 1));
	}

	static int suma(int a, int b) {
		return a + b;
	}

}
