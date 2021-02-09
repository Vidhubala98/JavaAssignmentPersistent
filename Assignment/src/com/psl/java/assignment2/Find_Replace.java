package com.psl.java.assignment2;

import java.util.Scanner;

public class Find_Replace {
	public void replace(String s,String find,String replace) {
		String replaced = s.replaceAll(find, replace);
		System.out.println(replaced);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Find_Replace f = new Find_Replace();
	System.out.println("Enter the string");
	String s = sc.nextLine();
	System.out.println("Enter the string to find");
	String find = sc.nextLine();
	System.out.println("Enter the string to replace");
	String replace = sc.nextLine();
	f.replace(s, find, replace);
}
}
