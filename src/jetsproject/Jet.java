package jetsproject;

import javax.swing.plaf.synth.SynthSeparatorUI;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = range;
	}

	public void fly() {
		double flyTime = range/speed; 
		
		
		System.out.println("Model: "+ model+" \tSpeed: " + speed+ "\tRange: " + range + "\tPrice: " + price +"." );
		System.out.println("Hours of fly time while going at maximum speed before running out of fuel: "+ flyTime+ "\n");
		
	}

	public double getSpeedInMach() {
		double result = speed * 0.00130332;
		return result;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}