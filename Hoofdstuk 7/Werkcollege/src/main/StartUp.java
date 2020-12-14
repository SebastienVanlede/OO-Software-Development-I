package main;

import cui.RekeningApplicatie_Oef4;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		DomeinController dController = new DomeinController();
		RekeningApplicatie_Oef4 rekApp = new RekeningApplicatie_Oef4(dController);
		rekApp.werkMetRekeningen();

	}

}
