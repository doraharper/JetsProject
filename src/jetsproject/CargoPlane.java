package jetsproject;

public class CargoPlane extends Jet implements CargoCarrier {
	
	

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("Load this plane with outrageously awesome cargo and super heavy.");
		
	}

	
	
}
