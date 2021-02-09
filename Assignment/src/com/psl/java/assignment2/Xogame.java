package com.psl.java.assignment2;

import java.util.Scanner;

public class Xogame {
	char[][] populateArray(char ch[][]) {
		for(int i=0;i<3;i++) {
			System.out.println("|-----|-----|-----|");
			System.out.print("|");
			for(int j=0;j<3;j++) {
				System.out.print(ch[i][j]);
				System.out.print("    |");
			}
			System.out.println();
		}
		System.out.println("|-----|-----|-----|");
		return ch;
	}

	void check(char ch[][]) {
		boolean turn = true,isDigit=false;
		int winner=1;
		char num,flag;
		populateArray(ch);
		while(winner<10) {
			if(turn) {
				flag = 'X';
			}
			else {
				flag ='Y';
			}
			System.out.println("It's "+flag+" turn. Enter the slot number 1-9");
			Scanner sc = new Scanner(System.in);
			num = sc.nextLine().charAt(0);
			if(num>'0' && num <='9') {
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(ch[i][j]==num) {
							isDigit = true;
							break;
						}
					}
					if(isDigit) {
						break;
					}
				}
			}
			if(isDigit) {
				switch(num) {
				case '1':
					ch[0][0] = flag;
					break;
				case '2':
					ch[0][1] = flag;
					break;
				case '3':
					ch[0][2] = flag;
					break;
				case '4':
					ch[1][0] = flag;
					break;
				case '5':
					ch[1][1] = flag;
					break;
				case '6':
					ch[1][2] = flag;
					break;
				case '7':
					ch[2][0] = flag;
					break;
				case '8':
					ch[2][1] = flag;
					break;
				case '9':
					ch[2][2] = flag;
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				populateArray(ch);
				if(ch[0][0]==flag && ch[0][1]==flag && ch[0][2]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[1][0]==flag && ch[1][1]==flag && ch[1][2]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[2][0]==flag && ch[2][1]==flag && ch[2][2]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[0][0]==flag && ch[1][0]==flag && ch[2][0]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[0][1]==flag && ch[1][1]==flag && ch[2][1]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[0][2]==flag && ch[1][2]==flag && ch[2][2]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[0][0]==flag && ch[1][1]==flag && ch[2][2]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}else if(ch[0][2]==flag && ch[1][1]==flag && ch[2][0]==flag) {
					System.out.println(flag+" WINS!");
					break;
				}
				isDigit = false;
				turn = !turn;
				winner++;
			}else {
				System.out.println("Slots are already taken");
			}
		}if(winner == 10) {
			System.out.println("Match draw :-)");
		}
	}
	public static void main(String[] args) {
		char ch[][] = new char[3][3];
		Xogame obj = new Xogame();
		int count=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ch[i][j] =(char)(count+'0');
				count++;
			}
		}
		obj.check(ch);
	}
}
