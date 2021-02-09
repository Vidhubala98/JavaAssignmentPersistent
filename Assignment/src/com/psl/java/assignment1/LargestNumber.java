package com.psl.java.assignment1;

import java.util.Scanner;

public class LargestNumber {
	static int calMax(int x,int y,int z) {
		int max;
		if(x>y && x>z) {
			max = x;
		}
		else if(y>z) {
			max = y;
		}
		else {
		    max =z;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter three numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println(LargestNumber.calMax(x, y, z));		
	}
}
