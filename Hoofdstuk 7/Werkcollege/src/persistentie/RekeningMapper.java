package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Rekening;
import domein.ZichtRekening;
import domein.SpaarRekening;

public class RekeningMapper {
	public List<Rekening> geefRekeningen() {
		List<Rekening> rekeningen = new ArrayList<>();

		Rekening rekening1 = new ZichtRekening(123456700082L, "Jan", -2000);
		rekening1.stortOp(1200);
		Rekening rekening2 = new SpaarRekening(123456780009L, "Sandra");
		rekening2.stortOp(5000);
		SpaarRekening.setAangroeiIntrest(5);
		
		rekeningen.add(rekening1);
		rekeningen.add(rekening2);
		return rekeningen;
	}

}
