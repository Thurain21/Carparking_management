package com.pjdc.thurain.sampleOne.Car_parking_management.model;

public class Carparking {

	private String name;
	private int number;
	
	public Carparking(String name, int number) {
		this.name = name;
		this.number= number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
