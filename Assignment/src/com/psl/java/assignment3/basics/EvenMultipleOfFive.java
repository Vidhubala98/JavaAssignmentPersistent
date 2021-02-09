package com.psl.java.assignment3.basics;

import java.util.Scanner;

public class EvenMultipleOfFive {
	static void findEvenMultipleOfFive(int arr[]) {
		System.out.println("List of even numbers which are multiple of 5 in an array: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
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
	EvenMultipleOfFive.findEvenMultipleOfFive(arr);
}
}
