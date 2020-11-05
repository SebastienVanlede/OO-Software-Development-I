package domein;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import domein.GeheimWoord;

public class GeheimWoordRepository {
	private List<GeheimWoord> geheimeWoorden;

	public GeheimWoordRepository() {
		geheimeWoorden = new ArrayList<>();
		geheimeWoorden.add(new GeheimWoord("jazz", 8));
		geheimeWoorden.add(new GeheimWoord("etui", 8));
		geheimeWoorden.add(new GeheimWoord("cactus", 10));
		geheimeWoorden.add(new GeheimWoord("suikerklontje", 20));
		geheimeWoorden.add(new GeheimWoord("curry", 10));

	}

	public GeheimWoord geefWillekeurigGeheimWoord() {
		SecureRandom random = new SecureRandom();
		return geheimeWoorden.get(random.nextInt(geheimeWoorden.size()));
	}
}