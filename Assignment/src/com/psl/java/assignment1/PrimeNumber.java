package com.psl.java.assignment1;

import java.util.Scanner;

public class PrimeNumber {
	void printPrime(int maxVal) {
		int i,j,flag;
		System.out.println("Prime Numbers");
		for(i=2;i<=maxVal;i++) {
			flag=0;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = 1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit number");
		int max = sc.nextInt();
		
		PrimeNumber obj = new PrimeNumber();
		obj.printPrime(max);
	}

}
