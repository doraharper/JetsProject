package jetsproject;

import java.util.Scanner;

public class AirField {
	private Jet[] jets = new Jet[15];

	// User story 2. Build Airfield with array of jets
	public AirField() {

		FighterJet fj = new FighterJet("F-35", 1150.90, 1380, 94_600_000);
		CargoPlane cp = new CargoPlane("C-5B", 531, 2760, 262_750_000);
		FighterJet fj2 = new FighterJet("AV-8B", 705, 1380, 1_500_000);
		JetImpl ji = new JetImpl("Big jet", 610, 4488, 80_00_000);
		CargoPlane cp2 = new CargoPlane("KC-130J", 417, 3262, 20_000_000);

		jets[0] = fj;
		jets[1] = cp;
		jets[2] = fj2;
		jets[3] = ji;
		jets[4] = cp2;
	}

	public void listJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].getModel());
			}
		}System.out.println();

	}

	public void makeJetsFly() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i].fly();
			}

		}

	}

	public void speedInMach() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i].getSpeedInMach();
			}

		}

	}

	public void getFastest() {
		Jet fastest = jets[0];
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastest.getSpeed()) {
					fastest = jets[i];
				}
			}
		}
		System.out.println(fastest.getModel() + " is fastest in speed at " + fastest.getSpeed() + " mph.");
		System.out.println("Speed in mach: " + fastest.getSpeedInMach() + "\n");
	}
	public void getLongestRange() {
		Jet longest = jets[0];
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest.getRange()) {
					longest = jets[i];
				}
			}
		}
		System.out.println(longest.getModel() + " is aircraft with the longest range at " + longest.getRange()+ "\n");
	}

	public void addJet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type aircraft model: ");
		String model = sc.next();

		// Jet j = new JetImpl(model, speed, range, price);
		//
		// for (int i = 0; i < jets.length; i++) {
		// if(jets[i]==null) {
		// jets[i] = j;
		// break;
		// }
	}

}
