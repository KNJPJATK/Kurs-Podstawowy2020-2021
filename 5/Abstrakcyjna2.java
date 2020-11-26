public abstract class Abstrakcyjna2 {
	
	public static void main(String[] args) {
		KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaAbstrakcyjna() {
			
			@Override
			public void doSomething() {
				System.out.println(this);
			}
			
		};
		klasaAbstrakcyjna.doSomething();
	}
	
	public static abstract class KlasaAbstrakcyjna {
		
		public abstract void doSomething();
		
	}
	
}
