package com.psl.java.assignment1;

import java.util.Scanner;

public class ElectricityBill {
	public double calculateElectricityBill(String type,int units) {
		double billAmount;
		if(type.equalsIgnoreCase("domestic")) {
			if(units<=100) {
				if(4*units<=250) {
					billAmount = 250;
				}else {
					billAmount = 4*units;
				}
			}else if(units>100 && units<=300) {
				billAmount = 4.50*units;
			}else if(units>300 && units<=500) {
				billAmount = 4.75*units;
			}else {
				billAmount = 5*units;
			}
		}else {
			if(units<=100) {
				if(4.25*units<=350) {
					billAmount = 350;
				}else {
					billAmount = 4.25*units;
				}
			}else if(units>100 && units<=300) {
				billAmount = 4.75*units;
			}else if(units>300 && units<=500) {
				billAmount = 5*units;
			}else {
				billAmount = 5.25*units;
			}
		}
		return billAmount;
	}
	
public static void main(String[] args) {
	ElectricityBill eb = new ElectricityBill();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the electricity type (domestic|commercial)");
	String type=sc.nextLine();
	System.out.println("Enter the units");
	int units= sc.nextInt();
	System.out.println("Bill Amount: "+String.format("%.2f",eb.calculateElectricityBill(type, units)));
}
}
