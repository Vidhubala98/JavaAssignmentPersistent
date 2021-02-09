package com.psl.java.assignment3.oop;

import java.util.Random;

class Medicine{
	String companyName;
	String address;

	Medicine(String companyName,String address){
		this.companyName = companyName;
		this.address = address;
	}

	void displayLabel() {
		System.out.println("Name of the company: "+companyName);
		System.out.println("Address of the company: "+address);
	}
}
class Tablet extends Medicine{
	Tablet(String x,String y){
		super(x,y);
	}
	void displayLabel() {
		super.displayLabel();
		System.out.println("Tablet: Store in a cool dry place");
	}
}
class Syrup extends Medicine{
	Syrup(String x,String y){
		super(x,y);
	}
	void displayLabel() {
		super.displayLabel();
		System.out.println("Syrup: Shake well before use");
	}
}
class Ointment extends Medicine{
	Ointment(String x,String y){
		super(x,y);
	}
	void displayLabel() {
		super.displayLabel();
		System.out.println("Ointment: for external use only");
	}
}
public class TestMedicine {
	public static void main(String[] args) {
		Medicine m[] = new Medicine[10];
		Random r = new Random();
		int random = r.nextInt(3)+1;
		String x="XYZ Company";
		String y="Bangalore";
		switch(random) {
		case 1:
			m[0] = new Tablet(x,y);
			m[0].displayLabel();
			break;
		case 2:
			m[1] = new Syrup(x,y);
			m[1].displayLabel();
			break;
		case 3:
			m[2] = new Ointment(x,y);
			m[2].displayLabel();
			break;
		default:
			System.out.println("Invalid Option");

		}
	}
}