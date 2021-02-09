package com.psl.java.assignment2;

import java.util.Scanner;

public class ReverseWord {
	static String  makeReverse(String str) {
		String s[]=str.split(" ");	
		String reverse="";
		for(String x:s) {
			StringBuilder ss = new StringBuilder(x).reverse();
			reverse +=ss.toString()+" ";
		}
		return reverse.trim();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String reverse=ReverseWord.makeReverse(str);
		System.out.println("Reverse of the given String:\n"+reverse);
	}

}
