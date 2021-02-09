package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class SplitString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	String a[] = s.split(" ");
	System.out.println("After split");
	for(String s1:a) {
	System.out.println(s1);
	}
}
}
