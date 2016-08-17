package com.AssessmentVehicle;

public class VehicleClass {
	
	protected boolean running = false;
	protected String color = null;
	
	
	public VehicleClass(boolean running, String color) {
		this.running = running;
		this.color = color;
	}


	public VehicleClass() {
	}


	public boolean isRunning() {
		return running;
	}


	public void setRunning(boolean running) {
		this.running = running;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}



}
