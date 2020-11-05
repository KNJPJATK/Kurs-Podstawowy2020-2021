public class PostPre {

	public static void main(String[] args) {
		int pre = 0;
		int post = 0;
		System.out.println("Preinkrementacja: " + ++pre);
		System.out.println("Postinkrementacja: " + post++);
		System.out.println("Preinkrementacja: " + pre);
		System.out.println("Postinkrementacja: " + post);
		System.out.println();

		int pre1 = 0;
		int post1 = 0;
		pre1 = pre1 + 1;
		System.out.println("Preinkrementacja: " + pre1);
		System.out.println("Postinkrementacja: " + post1);
		post1 = post1 + 1;
		System.out.println("Preinkrementacja: " + pre1);
		System.out.println("Postinkrementacja: " + post1);
	}

}
