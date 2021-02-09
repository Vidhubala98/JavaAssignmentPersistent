package com.psl.java.assignment4.oms;

public class Customer {
	String id;
	String name;
	String homePhone;
	String cellPhone;
	long workPhone;
	String street;
	String city;
	String state;
	String zip;
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	public String getCellPhone() {
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	public long getWorkPhone() {
		return workPhone;
	}
	
	public void setWorkPhone(long workPhone) {
		this.workPhone = workPhone;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void printPhoneNumbers() {
		System.out.println("Home Phone: "+getHomePhone());
		System.out.println("Cell Phone: "+getCellPhone());
		System.out.println("Work Phone: "+getWorkPhone());
	}
	
	public void printShippingAddress() {
		System.out.println("Street: "+getStreet());
		System.out.println("City: "+getCity());
		System.out.println("State: "+getState());
		System.out.println("Zip: "+getZip());
	}
	
	public void setPrintingAddress(String street, String city, String state, String zip) {
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
	}
	
	public void setPhoneNumbers(String homePhone, String cellPhone, long workPhone) {
		setHomePhone(homePhone);
		setCellPhone(cellPhone);
		setWorkPhone(workPhone);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
}
