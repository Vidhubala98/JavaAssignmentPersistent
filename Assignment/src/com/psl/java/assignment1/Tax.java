package com.psl.java.assignment1;

import java.util.Scanner;

public class Tax {
	static double calTax(int gp) {
		double tax;
		if(gp<=240) {
			tax =0;
		}else if(gp>240 && gp <480) {
			tax= 0.15;
		}else {
			tax =0.28;
		}
		return tax;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gross pay");
		int grossPay = sc.nextInt();
		System.out.println("Tax: "+Tax.calTax(grossPay));
	}
}
