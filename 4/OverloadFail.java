public class OverloadFail {

	public static void main(String[] args) {
		System.out.println(suma(1, 1));
	}

	static int suma(int a, int b) {
		System.out.println("Wywołanie z parametrami a i b");
		return a + b;
	}

	static int suma(int c, int d) {
		System.out.println("Wywołanie z parametrami c i d");
		return c + d;
	}

}
