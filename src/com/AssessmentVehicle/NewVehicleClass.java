package com.AssessmentVehicle;

import java.util.Scanner;

public class NewVehicleClass extends VehicleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numOfDoors = 4;
		int numOfHeadlights = 2;
		String typeOfVehicle = null;
		String makeOfVehicle = null;
		boolean hasRadio = false;

		System.out.println("What kind of vehicle do you want? (Enter in motorcycle, coupe, or sedan)");
		typeOfVehicle = sc.nextLine();
		System.out.println("What make of vehicle do you want?");
		makeOfVehicle = sc.nextLine();
		System.out.println("How many doors it have?");
		

	
	
	System.out.println("So you want "+ typeOfVehicle + " made by " + makeOfVehicle + ".");
	System.out.println("Since want a " + typeOfVehicle + " it has " + numOfDoors + " doors " + numOfHeadlights + " headlights.");
	

	}
}
