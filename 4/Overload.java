public class Overload {

	public static void main(String[] args) {
		System.out.println(suma(1, 1, 1, 1));
		System.out.println(suma(1, 1, 1));
	}

	static int suma(int a, int b) {
		System.out.println("Wywołanie z 2 parametrami");
		return a + b;
	}

	static int suma(int a, int b, int c) {
		System.out.println("Wywołanie z 3 parametrami");
		return suma(a, b) + c;
	}

	static int suma(int a, int b, int c, int d) {
		System.out.println("Wywołanie z 4 parametrami");
		return suma(suma(a, b), suma(c, d));
	}

}
