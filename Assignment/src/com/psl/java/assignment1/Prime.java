package com.psl.java.assignment1;

import java.util.Scanner;

public class Prime {
	static boolean isPrimeNumber(int num) {
		int flag=0;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(isPrimeNumber(num)) {
			System.out.println("The given number "+num+" is prime number");
		}else {
			System.out.println("The given number "+num+" is not a prime number");
		}
	}

}
