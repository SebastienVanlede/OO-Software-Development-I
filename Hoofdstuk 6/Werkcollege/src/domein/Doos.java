package domein;

public class Doos
{
	private double lengte, breedte, hoogte;
	private String kleur, code;
	private static int aantalDozen; //1 keer voor alle Doos-objecten hetzelfde

	public Doos()
	{
		this(1, 1, 1, "rood");
	}

	public Doos(double lengte, double breedte, double hoogte, String kleur)
	{
		this.setLengte(lengte);
		this.setBreedte(breedte);
		this.setHoogte(hoogte);
		this.setKleur(kleur);
		aantalDozen++;
		genereerCode();

	}
	
	@Override
	public String toString()
	{
		String res = String.format("Een doos met lengte %.2f, met breedte %.2f, met hoogte %.2f en kleur %s%n ", lengte,
				breedte, hoogte, kleur);
		res += String.format("Deze doos heeft als unieke code %s%n", code);
		return res;
	}

	private void genereerCode()
	{
		String res = String.format("D%015d", aantalDozen);
		setCode(res);
	}

	private void controleerAfmeting(String afmeting, double minWaarde, double waarde)
	{
		if (waarde <= minWaarde)
			throw new IllegalArgumentException("Fout in " + afmeting);
	}

	public final void setLengte(double lengte)
	{
		this.controleerAfmeting("lengte", 0, lengte);
		this.lengte = lengte;
	}

	private void setBreedte(double breedte)
	{
		this.controleerAfmeting("breedte", 0, breedte);
		this.breedte = breedte;
	}

	private void setHoogte(double hoogte)
	{
		this.controleerAfmeting("hoogte", 0, hoogte);
		this.hoogte = hoogte;
	}

	private void setKleur(String kleur)
	{
		if (kleur == null || kleur.equals("")) 
			throw new IllegalArgumentException("Kleur mag niet leeg zijn!");
		this.kleur = kleur;
	}

	private void setCode(String code)
	{
		this.code = code;
	}

	public double getLengte()
	{
		return lengte;
	}

	public double getBreedte()
	{
		return breedte;
	}

	public double getHoogte()
	{
		return hoogte;
	}

	public String getKleur()
	{
		return kleur;
	}

	public String getCode()
	{
		return code;
	}

	public static int getAantalDozen()
	{
		return aantalDozen;
	}

	

}