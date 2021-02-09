package com.psl.java.assignment.collections;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeTreeset implements Comparable<EmployeeTreeset>{
	String name;
	String employeeId;
	String gender;
	String address;
	String mobileNumber;
	String email;
	Date joinDate;
	public EmployeeTreeset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTreeset(String name, String employeeId, String gender, String address, String mobileNumber,
			String email, Date joinDate) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.joinDate = joinDate;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public static void main(String[] args) {
		TreeSet<EmployeeTreeset> tree = new TreeSet<>();
		EmployeeTreeset e = new EmployeeTreeset("abc", "123", "female","bangalore","9876543210","abc@gmail.com",Date.valueOf("2020-07-09"));
		tree.add(e);
		e = new EmployeeTreeset("def", "45", "male","cbe","8765493210","def@gmail.com",Date.valueOf("2021-01-19"));
		tree.add(e);
		System.out.println(tree);
		System.out.println("Employees joined before 2020-12-31");
		for(EmployeeTreeset e1:tree) {
			if(e1.joinDate.before(Date.valueOf("2020-12-31"))) {
				System.out.println(e1);
			}
		}
		System.out.println("all employees who have completed six months in organization.");
		for(EmployeeTreeset e1:tree) {
			if(e1.joinDate.toLocalDate().plusMonths(6).isBefore(LocalDate.now())) {
				System.out.println(e1);
			}
		}
		System.out.println("Display employee as per joining date recently joined employees at the Top");
		
		SortedSet<EmployeeTreeset> set = new TreeSet<>();
		set = new TreeSet<>(new Comparator<EmployeeTreeset>() {
			
			@Override
			public int compare(EmployeeTreeset o1, EmployeeTreeset o2) {
				// TODO Auto-generated method stub
				return o1.getJoinDate().compareTo(o2.getJoinDate());
			}
		});
		set.addAll(tree);
		System.out.println(set);
	}
	@Override
	public int compareTo(EmployeeTreeset o) {
		return Integer.parseInt(this.employeeId)-(Integer.parseInt(o.employeeId));
	}
	
	@Override
	public String toString() {
		return "EmployeeTreeset [name=" + name + ", employeeId=" + employeeId + ", gender=" + gender + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", email=" + email + ", joinDate=" + joinDate + "]";
	}
	
	
	
}
