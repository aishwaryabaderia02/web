package com.learn2drive.util;

public enum FuelType {
	
	PETROL(250), DIESEL(1440), NATURAL_GAS(2500);
	
	private int CombustionTempreture;

	public int getCombustionTempreture() {
		return CombustionTempreture;
	}

	private FuelType(int combustionTempreture) {
		CombustionTempreture = combustionTempreture;
	}

	public void setCombustionTempreture(int combustionTempreture) {
		this.CombustionTempreture = combustionTempreture;
	}
	
	
	
	
}
