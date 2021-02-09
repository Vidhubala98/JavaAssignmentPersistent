package com.psl.java.assignment.exception;

import java.sql.Date;
import java.util.regex.Pattern;

public class Contact {
	
	String firstName;
	String middleName;
	String lastName;
	String gender;
	String address;
	String area;
	String city;
	long pincode;
	String state;
	String country;
	Date dateOfBirth;
	Date anniversary;
	String telephoneNumber;
	String mobileNumber;
	String email;
	String website;
	
	public Contact(String firstName, String middleName, String lastName, String gender, String address, String area,
			String city, long pincode, String state, String country, Date dateOfBirth, Date anniversary,
			String telephoneNumber, String mobileNumber, String email, String website) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.anniversary = anniversary;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.website = website;
	}
	
	public void validate() {
		try {
			firstName.length();
			lastName.length();
			dateOfBirth.toString().length();
			if(email.length()>0) {
				isValid(email);
			}
			if(mobileNumber.length()==10) {
				System.out.println("Mobile number"+mobileNumber);
			}else if(telephoneNumber.length() == 10){
				System.out.println("Telephone number"+telephoneNumber);
			}else {
				throw new IllegalArgumentException("The mobile or telephone number is mandatory");
			}			
		}catch (NullPointerException e) {
			System.out.println("Firstname lastName DOB email mobile number should be mandatory");
		}
	}
	
	public void isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if(pat.matcher(email).matches()) {
        	System.out.println("Email Format is correct");
        }else {
        	System.out.println("Wrong Email Format . Please give email in abc@gmail.com format");
        }
    }
	
	public static void main(String[] args) {
		String firstName = null,lastName = null,telephoneNumber = null,mobileNumber = null;
		Date dateOfBirth=null;
		Contact contact = new Contact(firstName,"abcd" ,lastName, "F", "abc", "abc", "abc", 678234, "abc", "abc",dateOfBirth, Date.valueOf("2020-09-12"),telephoneNumber , mobileNumber, "abc@gmail.com", "abc.com");
		contact.validate();
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender="
				+ gender + ", address=" + address + ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", country=" + country + ", dateOfBirth=" + dateOfBirth + ", anniversary="
				+ anniversary + ", telephoneNumber=" + telephoneNumber + ", mobileNumber=" + mobileNumber + ", email="
				+ email + ", website=" + website + "]";
	}
	
	
}
