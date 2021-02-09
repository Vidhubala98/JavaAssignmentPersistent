package com.psl.java.assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Theater {
	public static float calculateProfit(int numAttendees) {
		float performanceCost,ticketCost,attendeeCost,earnedAmount,spentAmount,profit;
		performanceCost=20;
		ticketCost=5;
		attendeeCost=.50f;
		earnedAmount=ticketCost*numAttendees;
		spentAmount= performanceCost + (attendeeCost*numAttendees);
		profit = earnedAmount - spentAmount;
		return profit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of attendees");
		int no = sc.nextInt();
		System.out.println("Profit: "+String.format("%.2f",Theater.calculateProfit(no)));
	}
}
