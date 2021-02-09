package com.psl.java.assignment4.oms;

import java.util.Scanner;

public class CustomerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String id ,name ,homePhone, cellPhone, street, city, state, zip;
	long workPhone;
	Customer c[] = new Customer[3];
	int count = 0;
	while(count < c.length) {
		System.out.println("Enter customer id");
		id = sc.nextLine();
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter home phone: ");
		homePhone = sc.nextLine();
		System.out.println("Enter cell phone: ");
		cellPhone = sc.nextLine();
		System.out.println("Enter work phone: ");
		workPhone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter street: ");
		street = sc.nextLine();
		System.out.println("Enter city: ");
		city = sc.nextLine();
		System.out.println("Enter state: ");
		state = sc.nextLine();
		System.out.println("Enter zip: ");
		zip = sc.nextLine();
		
		c[count] = new Customer(id, name);
		c[count].setPhoneNumbers(homePhone, cellPhone, workPhone);
		c[count].setPrintingAddress(street, city, state, zip);
		count++;
	}
	
	for(count=0;count<c.length;count++) {
		c[count].printPhoneNumbers();
		c[count].printShippingAddress();
		System.out.println(c[count].toString());
	}
}
}
