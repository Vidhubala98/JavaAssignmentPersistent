package com.psl.java.assignment1;

public class MultiplicationTable {
public static void main(String[] args) {
	int a[][] = new int[13][13];
	int i,j,k,count=1;
	for(i=1;i<13;i++) {
		a[0][i] = count;
		a[i][0] = count++;
	}
	
	for(i=1;i<13;i++) {
		for(j=1;j<13;j++) {
			a[i][j] = a[i][0] * a[0][j];
		}
	}
	
	for(i=0;i<13;i++) {
		for(j=0;j<13;j++) {
			if(i==0 && j==0) {
				System.out.print("\t");
			}else {
			System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println();
	}
	
}
}
