package com.psl.java.assignment3.abcshop;

public class SoftwareProduct extends Product {
	String operatingSystem;
	String memory;
	String licenseKey;
	public SoftwareProduct(String productId, String productName, String serialNumber, String type, String operatingSystem,
			String memory, String licenseKey) {
		super(productId, productName, serialNumber, type);
		this.operatingSystem = operatingSystem;
		this.memory = memory;
		this.licenseKey = licenseKey;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getLicenseKey() {
		return licenseKey;
	}
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

}
