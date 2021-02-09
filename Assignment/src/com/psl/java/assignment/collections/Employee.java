package com.psl.java.assignment.collections;

import java.util.ArrayList;

public class Employee {
	String name;
	String employeeId;
	String gender;
	String address;
	String mobileNumber;
	String email;
	ArrayList<Integer> vehicle = new ArrayList<>();
	public Employee(String name, String employeeId, String gender, String address, String mobileNumber, String email,
			ArrayList<Integer> vehicle) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", gender=" + gender + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", vehicle=" + vehicle + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ArrayList<Integer> getVehicle() {
		return vehicle;
	}


	public void setVehicle(ArrayList<Integer> vehicle) {
		this.vehicle = vehicle;
	}


	public static void main(String[] args) {
		ArrayList<Integer> vehicle = new ArrayList<>();
		vehicle.add(1009);
		vehicle.add(9876);
		Employee e = new Employee("abc", "123", "female","bangalore","9876543210","abc@gmail.com",vehicle);
		System.out.println(e);
	}
}
