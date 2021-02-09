package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class StringPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(s.charAt(j)+" ");
		}
		System.out.println();
	}
}
}
