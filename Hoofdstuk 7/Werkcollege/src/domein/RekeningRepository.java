package domein;

import java.util.List;

import persistentie.RekeningMapper;

public class RekeningRepository {

	private RekeningMapper rm;
	private List<Rekening> rekeningen;
	
	public RekeningRepository() {
		rm = new RekeningMapper();
		rekeningen = rm.geefRekeningen();
	}
	
	public List<Rekening> geefGewijzigdeRekening(){
		for (Rekening rek : rekeningen) {
			if (rek instanceof SpaarRekening) {
				double verhoging = rek.getSaldo()*SpaarRekening.getAangroeiIntrest()/100;
				rek.stortOp(verhoging);
			} else {
				ZichtRekening zrek = (ZichtRekening)rek;
				zrek.setMaxKredietOnderNul(zrek.getMaxKredietOnderNul()-10);
			}
		}
		return rekeningen;
	}
}
