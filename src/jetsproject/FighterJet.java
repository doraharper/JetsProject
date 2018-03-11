package jetsproject;

public class FighterJet extends Jet implements CombatReady {

	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public void fight() {
		System.out.println("Engage in dogfight. Not to be confused with dogs fighting");

	}
	@Override
	public void verticalTakeOff() {
		System.out.println("Vertical take off and landing");
	}

	


}
