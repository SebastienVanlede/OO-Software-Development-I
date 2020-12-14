package ui;

import java.util.ArrayList;
import java.util.List;

import domein.Sleutel;
import domein.Voorwerp;
import domein.Wapen;

public class VoorwerpApplicatie_Oefening1 {

	public void Start() {
		List<Voorwerp> voorwerpenList = new ArrayList<>();

		Sleutel sleutel1 = new Sleutel("voordeur", 0.5, 3, 1);
		Sleutel sleutel2 = new Sleutel("achterdeur", 0.5, 1, 2);

		Wapen wapen1 = new Wapen("colt", 1.5, 3, 6, false);
		Wapen wapen2 = new Wapen("brown", 5, 1, 23, true);

		voorwerpenList.add(sleutel1);
		voorwerpenList.add(sleutel2);
		voorwerpenList.add(wapen1);
		voorwerpenList.add(wapen2);

		for (Voorwerp voorwerp : voorwerpenList) {
			System.out.println(voorwerp.toString());

		}
	}

}
