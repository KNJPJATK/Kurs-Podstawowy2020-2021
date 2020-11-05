public class InstrukcjaWyboru {

	public static void main(String[] args) {
		if (args.length >= 1) {
			String arg1 = args[0];
			switch (arg1) {
				case "1":
					System.out.println("Poniedziałek");
				case "2":
					System.out.println("Wtorek");
				case "3":
					System.out.println("Środa");
				case "4":
					System.out.println("Czwartek");
				case "5":
					System.out.println("Piątek");
				case "6":
					System.out.println("Sobota");
				case "7":
					System.out.println("Niedziela");
				default:
					System.out.println("Nie znam takiego dnia tygodnia. " + arg1);
			}
		}
	}

}
