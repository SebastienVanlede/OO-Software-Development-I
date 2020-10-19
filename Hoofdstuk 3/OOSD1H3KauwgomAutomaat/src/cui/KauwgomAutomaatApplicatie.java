package cui;

import domein.KauwgomAutomaat;

public class KauwgomAutomaatApplicatie {

	public static void main(String[] args) { // <1>

		//maken van 2 objecten KauwgomAutomaat
		KauwgomAutomaat ka1 = new KauwgomAutomaat(); // <2>
		KauwgomAutomaat ka2 = new KauwgomAutomaat(50); // <3>

		//afdrukken van kleur en aantal balletjes // <4>
		System.out.printf("De eerste kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka1.getKleur(), ka1.getAantalBallen()); 
		System.out.printf("De tweede kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka2.getKleur(), ka2.getAantalBallen());
		
		//ontgrendelen
		ka1.setVergrendeld(false); // <5>
		
		//vullen
		ka1.vulBij(20); // <6>
		
		//vergrendelen
		ka1.setVergrendeld(true); // <7>
		
		//afdrukken van kleur en aantal balletjes
		System.out.printf("De eerste kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka1.getKleur(), ka1.getAantalBallen());
		System.out.printf("De tweede kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka2.getKleur(), ka2.getAantalBallen());		
		
		//vullen
		ka1.vulBij(75); // <8>
		
		//afdrukken van kleur en aantal balletjes
		System.out.printf("De eerste kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka1.getKleur(), ka1.getAantalBallen()); // <9>
		System.out.printf("De tweede kauwgomautomaat is %s van kleur en bevat %d balletjes.%n", ka2.getKleur(), ka2.getAantalBallen());	
	}
}
