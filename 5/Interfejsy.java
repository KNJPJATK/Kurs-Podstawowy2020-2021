public class Interfejsy {
	
	public static void main(String[] args) {
		MojPierwszyInterfejs mojPierwszyInterfejs = new MojaKlasa();
		mojPierwszyInterfejs.doSomething();
	}
	
	public static interface MojPierwszyInterfejs {
		
		void doSomething();
		
	}
	
	public static class MojaKlasa implements MojPierwszyInterfejs {
		
		@Override
		public void doSomething() {
			System.out.println(this);
		}
		
	}
	
}
