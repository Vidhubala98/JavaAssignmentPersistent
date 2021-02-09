package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class TotalSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Total spaces in a string:"+s);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
