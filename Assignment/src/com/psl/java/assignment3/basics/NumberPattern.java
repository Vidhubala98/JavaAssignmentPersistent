package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class NumberPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int i,j,count;
	for(i=0;i<num;i++) {
		count =1;
		for(j=0;j<=i;j++) {
			System.out.print(count+++" ");
		}
		System.out.println();
	}
	for(i=0;i<num-1;i++) {
		count =1;
		for(j=0;j<num-i-1;j++) {
			System.out.print(count+++" ");
		}
		System.out.println();
	}
}
}
