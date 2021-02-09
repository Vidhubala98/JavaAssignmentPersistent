package com.psl.java.assignment.matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int opt,row1,col1,row2,col2,m1[][],m2[][],i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option 1.add 2.multiply 3.transpose");
		opt = sc.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Enter row / col of matrix");
			row1 = sc.nextInt();
			col1 = row1;
			m1 = new int[row1][col1];
			m2 = new int[row1][col1];
			System.out.println("Enter first array values");
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					m1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter second array values");
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					m2[i][j] = sc.nextInt();
				}
			}
			addMatrix(m1, m2);
			break;
		case 2:
			System.out.println("Enter row of matrix1");
			row1 = sc.nextInt();
			System.out.println("Enter col of matrix1");
			col1 = sc.nextInt();
			System.out.println("Enter first array values");
			m1 = new int[row1][col1];
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					m1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter row of matrix2");
			row2 = sc.nextInt();
			System.out.println("Enter col of matrix2");
			col2 = sc.nextInt();
			m2 = new int[row2][col2];
			System.out.println("Enter second array values");
			for(i=0;i<row2;i++) {
				for(j=0;j<col2;j++) {
					m2[i][j] = sc.nextInt();
				}
			}
			if(col1==row2) {
				multiplyMatrix(m1, m2);
			}
			break;
		case 3:
			System.out.println("Enter row of matrix");
			row1 = sc.nextInt();
			System.out.println("Enter col of matrix");
			col1 = sc.nextInt();
			m1 = new int[row1][col1];
			System.out.println("Enter array values");
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					m1[i][j] = sc.nextInt();
				}
			}
			transposeMatrix(m1);
			break;
		default:
			break;	
		}		
	}

	public static void addMatrix(int m1[][],int m2[][]) {
		int m3[][] = new int[m1.length][m1.length];
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1.length;j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1.length;j++) {
				System.out.println(m3[i][j]);
			}
		}
	}

	public static void multiplyMatrix(int m1[][],int m2[][]) {
		int row1 = m1.length;
		int col1 = m1[0].length;
		int row2 = m2.length;
		int col2 = m2[0].length;
		int temp;
		int m3[][] = new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				m3[i][j]=0;
				for(int k=0;k<row2;k++) {
					m3[i][j]+=m1[i][k]+m2[k][j];
				}
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void transposeMatrix(int m1[][]) {
		int m2[][] = new int[m1.length][m1[0].length];
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m2[i][j] = m1[j][i];
			}
		}
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[i].length;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
