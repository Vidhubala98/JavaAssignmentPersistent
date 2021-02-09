package com.psl.java.assignment2;

import java.util.Scanner;

public class PrintPrime {
	int[] findPrime(int lower,int upper) {
		int i,j,flag,count=0;
		int num[] = new int[upper-lower];
		for(i=lower;i<=upper;i++) {
			flag=0;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = 1;
				}
			}
			if(flag==0) {
				num[count++] = i;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit number");
		int lower = sc.nextInt();
		System.out.println("Enter the upper limit number");
		int upper = sc.nextInt();
		
		PrintPrime obj = new PrintPrime();
		int num []=obj.findPrime(lower, upper);
		for(int x=0;x<num.length && num[x]!=0;x++) {
			System.out.println(num[x]);
		}
	}
}
