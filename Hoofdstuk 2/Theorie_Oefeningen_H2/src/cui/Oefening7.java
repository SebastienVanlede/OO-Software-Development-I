package cui;

public class Oefening7 {

	public static void main(String[] args) {
		//A
		/*
		int getal, som = 0;
		int deelbaar = 0;
		
		for(getal = 1; getal <= 500; getal++) {
			if(getal%12 == 0)
				som += getal;
		}
			
		System.out.printf("De som van de gehele getallen tussen 1 en 500 deelbaar door 12 zijn: %d%n", som);
		*/
		
		//B
		/*
		int getal;
		
		for(getal = 51; getal <= 999999999; getal++) {
			if (getal > 51) {
				System.out.printf("%d", getal);
				getal -= 1;
			}
			
		}
		*/
		
		//C
		char alfabet;
		for (alfabet = 'a'; alfabet <= 'z'; alfabet++ ) {
			System.out.printf("%S", alfabet);
		}
			
	}

}
