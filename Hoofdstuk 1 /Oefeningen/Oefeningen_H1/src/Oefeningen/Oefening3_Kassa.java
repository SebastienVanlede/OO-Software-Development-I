package Oefeningen;

public class Oefening3_Kassa {

	public static void main(String[] args) {
		int ontvangenBedrag = 100, teBetalen = 45, terug;
		
		System.out.printf("Te betalen = %d%n", teBetalen);
		System.out.printf("Ontvangen bedrag= %d%n", ontvangenBedrag);
		terug = ontvangenBedrag - teBetalen;
		System.out.printf("Terug = %d%n", terug);
		
		/*
		
		// Korter:
		terug = ontvangenBedrag - teBetalen;
       		System.out.printf("Te betalen = %d%n" +
                "Ontvangen bedrag = %d%n" +
                "Terug = %d%n", 
		teBetalen, ontvangenBedrag, terug);

		*/
	}

}
