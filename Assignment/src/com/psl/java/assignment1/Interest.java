package com.psl.java.assignment1;

import java.util.Scanner;

public class Interest {
	static double calInterest(int amt) {
		double interest;
		if(amt<=1000) {
			interest = amt *(0.04);
		}else if(amt<=5000) {
			interest = amt * (0.045);
		}else {
			interest = amt * (0.05);
		}
		return interest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amount");
		int depositAmount= sc.nextInt();
		System.out.println("Interest: "+String.format("%.2f",Interest.calInterest(depositAmount)));
	}
}
