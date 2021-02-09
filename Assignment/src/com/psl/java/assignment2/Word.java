package com.psl.java.assignment2;

import java.util.Scanner;

public class Word {
	static int check(String sentence,String word){
		int count=0;
		String s[] = sentence.split(" ");
		for(String str:s) {
			if(word.equals(str)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String word = sc.nextLine();
		System.out.println("No of Occurence: "+Word.check(sentence,word));
	}
}
