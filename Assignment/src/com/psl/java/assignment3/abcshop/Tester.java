package com.psl.java.assignment3.abcshop;

import java.util.Scanner;

public class Tester {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int noOfProduct,i;
	
	String productId,productName,serialNumber,type,operatingSystem,memory,licenseKey,capacity,brand,powerSupply,batteryBackup;
	double dimensions;
	
	System.out.println("Enter the no of products");
	noOfProduct = sc.nextInt();
	sc.nextLine();// Consume newline left-over
	
	Product p[]=new Product[noOfProduct];
	
	for(i=0;i<noOfProduct;i++) {
	System.out.println("Enter the product id");
	productId = sc.nextLine();
	System.out.println("Enter the product name");
	productName = sc.nextLine();
	System.out.println("Enter the serial number");
	serialNumber = sc.nextLine();
	System.out.println("Enter the type (software/hardware/other)");
	type = sc.nextLine();
	
	if(type.equalsIgnoreCase("Software")) {
		System.out.println("Enter the operating System");
		operatingSystem = sc.nextLine();
		System.out.println("Enter the memory");
		memory =sc.nextLine();
		System.out.println("Enter the license key");
		licenseKey = sc.nextLine();
		p[i] = new SoftwareProduct(productId, productName, serialNumber, type, operatingSystem, memory, licenseKey);
	}else if(type.equalsIgnoreCase("Hardware")) {
		System.out.println("Enter the dimension");
		dimensions = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the capacity");
		capacity = sc.nextLine();
		System.out.println("Enter the brand");
		brand = sc.nextLine();
		System.out.println("Enter the power supply");
		powerSupply = sc.nextLine();
		System.out.println("Enter the battery backup");
		batteryBackup = sc.nextLine();
		p[i] =new HardwareProduct(productId, productName, serialNumber, type, dimensions, capacity, brand, powerSupply, batteryBackup);
	}else {
		p[i] = new Product(productId, productName, serialNumber, type);
	}
	}
	
	System.out.println("Products list:");
	for(i=0;i<noOfProduct;i++) {
		System.out.println("product id: " +p[i].getProductId());
		System.out.println("product name: "+p[i].getProductName());
		System.out.println("serial number: "+p[i].getSerialNumber());
		System.out.println("type: "+p[i].getType());
		if (p[i] instanceof SoftwareProduct) {
			System.out.println("operating System: "+((SoftwareProduct)p[i]).getOperatingSystem());
			System.out.println("memory: "+((SoftwareProduct)p[i]).getMemory());
			System.out.println("license key: "+((SoftwareProduct)p[i]).getLicenseKey());	
		}else if(p[i] instanceof HardwareProduct) {
			System.out.println("dimension: "+((HardwareProduct)p[i]).getDimensions());
			System.out.println("capacity: "+((HardwareProduct)p[i]).getCapacity());
			System.out.println("brand: "+((HardwareProduct)p[i]).getBrand());
			System.out.println("power supply: "+((HardwareProduct)p[i]).getPowerSupply());
			System.out.println("battery backup: "+((HardwareProduct)p[i]).getBatteryBackup());
		}
		System.out.println("---------------------------------------------");
	}	
}
}
