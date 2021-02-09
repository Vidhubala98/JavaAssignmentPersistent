package com.psl.java.assignment2;

import java.util.Scanner;

public class Permutation {
public static void main(String[] args) {
	Permutation p = new Permutation();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	String s = sc.nextLine();
	p.permute(s);
}

private void permute(String string) {
	getPermutation("",string);
}

private void getPermutation(String f, String u) {
	if(u.length()==0) {
		System.out.println(f);
	}
	else {
		for(int i=0;i<u.length();i++) {
			String fixed = f + u.charAt(i);
			String unfixed = u.substring(0,i)+u.substring(i+1);
			getPermutation(fixed, unfixed);
		}
	}
}
}
