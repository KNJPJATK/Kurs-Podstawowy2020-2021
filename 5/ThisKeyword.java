public class ThisKeyword {
	
	public static void main(String[] args) {
		Klasa mojaKlasa1 = new Klasa("Klasa nr. 1");
		Klasa mojaKlasa2 = new Klasa("Klasa nr. 2");
		
		System.out.println(mojaKlasa1.getPoleKlasy());
		System.out.println(mojaKlasa2.getPoleKlasy());
	}
	
	public static class Klasa {
		
		private String poleKlasy;
		
		public Klasa(String poleKlasy) {
			this.poleKlasy = poleKlasy;
		}
		
		public String getPoleKlasy() {
			return this.poleKlasy;
		}
		
		public void setPoleKlasy(String poleKlasy) {
			this.poleKlasy = poleKlasy;
		}
		
	}
	
}
