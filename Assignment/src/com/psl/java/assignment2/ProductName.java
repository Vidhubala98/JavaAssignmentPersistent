package com.psl.java.assignment2;

import java.util.Scanner;

public class ProductName {
	static String[] initProductNames() {
		System.out.println("Enter the no of products");
		Scanner sc = new Scanner(System.in);
		int noOfProducts = sc.nextInt();
		sc.nextLine();
		String s[] = new String[noOfProducts];
		System.out.println("Enter the product names one by one");
		for(int i=0;i<noOfProducts;i++) {
			s[i] = sc.nextLine();
		}
		return s;
	}
	static boolean isPresent(String[] productNames, String keyword) {
		for(String s:productNames) {
			if(s.contains(keyword)) {
				return true;
			}
		}
		return false;
	}

public static void main(String[] args) {
	String productNames[]=ProductName.initProductNames();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the keyword");
	String keyword = sc.nextLine();
	if(ProductName.isPresent(productNames, keyword)) {
		System.out.println("Product Name is present");
	}else {
		System.out.println("Product Name is not present");
	}
}
}
