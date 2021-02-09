package com.psl.java.assignment.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MovieException {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\Java_Assignment\\Assignment\\src\\com\\psl\\java\\assignment\\exception\\Movies.txt");
			int ch,count=0;
			String s ="";
			while((ch=fr.read())!=-1) {
				s = s+(char)ch;			
				if((char)ch==';') {
					count++;
					try {
						s = s.substring(0,s.indexOf(" "));
						Integer.parseInt(s.trim());						
					}catch (NumberFormatException e) {
						System.out.println(s+" Movie id should be integer");
					}finally {
						s="";
					}
				}
			}
			System.out.println("No of movies"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
