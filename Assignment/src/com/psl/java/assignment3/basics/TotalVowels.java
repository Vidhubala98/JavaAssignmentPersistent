package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class TotalVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Total vowels in a string:"+s);
		int count=0;
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
