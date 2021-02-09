package com.psl.java.assignment1;

import java.util.Scanner;

public class Alphabet {
	static boolean checkAlpha(char alph) {
		if(alph =='a' ||alph =='e' ||alph =='i' ||alph =='o' ||alph =='u') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		a = Character.toLowerCase(a);
		if(checkAlpha(a)) {
			System.out.println("Given character is vowel");
		}else {
			System.out.println("Given character is consonant");
		}
	}

}
