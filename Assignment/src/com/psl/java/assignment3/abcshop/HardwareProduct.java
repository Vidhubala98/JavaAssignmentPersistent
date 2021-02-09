package com.psl.java.assignment3.abcshop;

public class HardwareProduct extends Product{
	double dimensions;
	String capacity;
	String brand;
	String powerSupply;
	String batteryBackup;
	
	public HardwareProduct(String productId, String productName, String serialNumber, String type, double dimensions, 
			String capacity, String brand, String powerSupply, String batteryBackup) {
		super(productId, productName, serialNumber, type);
		this.dimensions = dimensions;
		this.capacity = capacity;
		this.brand = brand;
		this.powerSupply = powerSupply;
		this.batteryBackup = batteryBackup;
	}

	public double getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(double dimensions) {
		this.dimensions = dimensions;
	}
	
	public String getCapacity() {
		return capacity;
	}
	
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getPowerSupply() {
		return powerSupply;
	}
	
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}
	
	public String getBatteryBackup() {
		return batteryBackup;
	}
	
	public void setBatteryBackup(String batteryBackup) {
		this.batteryBackup = batteryBackup;
	}
	
}
