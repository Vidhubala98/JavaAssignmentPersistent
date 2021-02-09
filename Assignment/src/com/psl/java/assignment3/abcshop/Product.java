package com.psl.java.assignment3.abcshop;

public class Product {
	String productId;
	String productName;
	String serialNumber;
	String type;
	public Product(String productId, String productName, String serialNumber, String type) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.serialNumber = serialNumber;
		this.type = type;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
