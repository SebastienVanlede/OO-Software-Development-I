package domein;

public class DomeinController {

	private VoorwerpRepository repository;

	public DomeinController() {
		repository = new VoorwerpRepository();
	}
	
	public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		Voorwerp voorwerp = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
		repository.voegVoorwerpToe(voorwerp);
	}
	
	public void voegSleutelToe(String naam, double gewicht, int niveau, int deur) {
		Voorwerp voorwerp = new Sleutel(naam, gewicht, niveau, deur);
		repository.voegVoorwerpToe(voorwerp);
		
	}
	
	public String geefOverzicht() {
		return repository.geefOverzicht();
	}
	
	
	
	
}
