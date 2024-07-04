package com.npru.se65.id65001;

public class HumanBeing {
	private double height;
	private double weight;
	private double bmi;
	
	private double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	private double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	private void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	public void calculateBMI() {
		BmiIndexer bi = new BmiIndexer();
		setBmi(bi.calculateBMI(getHeight(), getWeight()));
	}
	
	public String analyzeBmi() {
		HealthAnalyzer ha = new HealthAnalyzer();
		return ha.analyzeBmi(getBmi());
	}
	
}