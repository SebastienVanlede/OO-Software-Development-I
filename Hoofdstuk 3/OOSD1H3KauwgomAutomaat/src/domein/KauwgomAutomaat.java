package domein;

public class KauwgomAutomaat {


		private int aantalBallen;
		private String kleur;	
		private boolean vergrendeld = true;

		public KauwgomAutomaat(int aantalBallen) {
			setAantalBallen(aantalBallen);
			setKleur("rood");
		}

		public KauwgomAutomaat() {
			this(0);
		}

		public boolean isLeeg() {
			return aantalBallen == 0;
		}

		public void vulBij(int aantalBallen) {
			if (!vergrendeld)
				setAantalBallen(this.aantalBallen + aantalBallen);
		}

		public int getAantalBallen() {
			return aantalBallen;
		}

		private void setAantalBallen(int aantalBallen) {
			if (aantalBallen >= 0 && aantalBallen < 150)
				this.aantalBallen = aantalBallen;
		}

		public String getKleur() {
			return kleur;
		}
		
		private void setKleur(String kleur) {
			this.kleur = kleur;
		}
		
		public boolean isVergrendeld() {
			return vergrendeld;
		}
		
		public final void setVergrendeld(boolean vergrendeld) {
			this.vergrendeld = vergrendeld;
		}
}
