public class InstrukcjaWarunkowa {

	public static void main(String[] args) {
		if (args.length >= 2) {
			System.out.printf("%15s\t%s\n", "args[0]:", args[0]);
			System.out.printf("%15s\t%s\n", "args[1]:", args[1]);
		} else {
			System.out.println("Niepoprawna liczba argumentów. Spodziewano się co najmniej 2 argumentów.");
		}
	}

}
