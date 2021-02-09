package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class EvenNumber {
	static void findTotalEvenNumber(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println("Total of even numbers in an array: "+count);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the array elemnts");
	for(int i=0;i<size;i++) {
		arr[i] = sc.nextInt();
	}
	EvenNumber.findTotalEvenNumber(arr);
}
}
