package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class TotalCharacters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String s = sc.nextLine();
	System.out.println("Total characters in a string:"+s);
//	System.out.println(s.length());
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println(count);
}
}
