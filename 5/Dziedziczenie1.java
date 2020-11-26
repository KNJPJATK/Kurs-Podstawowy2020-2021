public class Dziedziczenie1 {
	
	public static void main(String[] args) {
		KlasaPochodna klasaPochodna = new KlasaPochodna();
		klasaPochodna.setPoleKlasyPochodnej("Ustawione pole klasy pochodnej");
		klasaPochodna.setPoleKlasyBazowej("Ustawione pole klasy bazowej");
		
		System.out.println("Pole klasy pochodnej: " + klasaPochodna.getPoleKlasyPochodnej());
		System.out.println("Pole klasy bazowej: " + klasaPochodna.getPoleKlasyBazowej());
	}
	
	public static class KlasaBazowa {
		
		private String poleKlasyBazowej;
		
		public String getPoleKlasyBazowej() {
			return poleKlasyBazowej;
		}
		
		public void setPoleKlasyBazowej(String poleKlasyBazowej) {
			this.poleKlasyBazowej = poleKlasyBazowej;
		}
		
	}
	
	public static class KlasaPochodna extends KlasaBazowa {
		
		private String poleKlasyPochodnej;
		
		public String getPoleKlasyPochodnej() {
			return poleKlasyPochodnej;
		}
		
		public void setPoleKlasyPochodnej(String poleKlasyPochodnej) {
			this.poleKlasyPochodnej = poleKlasyPochodnej;
		}
		
	}
	
}