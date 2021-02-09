package com.psl.java.assignment2;

import java.util.Scanner;

public class NumberPosition {
	static int findPosition(int num,int[] nos) {
		for(int i=0;i<nos.length;i++) {
			if(num == nos[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int count = sc.nextInt();
		int nos[]=new int[count];
		System.out.println("Enter the numbers");
		for(int i=0;i<count;i++) {
			nos[i] = sc.nextInt();
		}
		System.out.println("Enter the number to find");
		int num = sc.nextInt();
		int index = NumberPosition.findPosition(num, nos);
		if(index==-1) {
			System.out.println("The number is not present in the given array");
		}else {
		System.out.println("The position of the number is "+index);
		}
	}
}
