package domein;

public class PerfectGetal {

	public boolean isPerfect(int getal){
		if (getal < 0)
	   		throw new IllegalArgumentException(
				"Getal mag niet negatief zijn");
		
		if (getal == 0 || getal == 1) {
	   		return false;
		}

		return (getal == somVanDelers(getal));
	  }

	  private int somVanDelers(int x) {
		int som = 0;
		for (int i = x/2;i >= 1;i--)
			if (x % i == 0)
				som += i;
		return som;
	  }

}
