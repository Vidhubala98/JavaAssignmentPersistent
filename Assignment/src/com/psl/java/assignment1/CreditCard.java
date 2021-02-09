package com.psl.java.assignment1;

import java.util.Scanner;

public class CreditCard {
	static double calPayBackAmount(double chargeAmount) {
		double payBackAmount;
		if(chargeAmount<=500) {
			payBackAmount = chargeAmount * (.25/100);
		}else if(chargeAmount<=1500){
			payBackAmount = 500 * (.25/100);
			chargeAmount = chargeAmount - 500;
			payBackAmount = payBackAmount + (chargeAmount * (.50/100));
		}else if(chargeAmount<=2500) {
			payBackAmount = 500 * (.25/100);
			chargeAmount = chargeAmount - 500;
			payBackAmount += 1000 * (.50/100);
			chargeAmount = chargeAmount - 1000;
			payBackAmount = payBackAmount + (chargeAmount * (.75/100));
		}else {
			payBackAmount = 500 * (.25/100);
			chargeAmount = chargeAmount - 500;
			payBackAmount += 1000 * (.50/100);
			chargeAmount = chargeAmount - 1000;
			payBackAmount += 1000 * (.75/100);
			chargeAmount = chargeAmount - 1000;
			payBackAmount = payBackAmount + (chargeAmount * (1/100));
		}
		return payBackAmount;
	}

	public static void main(String[] args) {
		CreditCard cd = new CreditCard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charge amount");
		double chargeAmount = sc.nextDouble();
		System.out.println("Pay Back Amount: "+cd.calPayBackAmount(chargeAmount));
	}
}
