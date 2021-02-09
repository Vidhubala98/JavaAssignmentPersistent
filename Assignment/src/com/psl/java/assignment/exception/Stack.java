package com.psl.java.assignment.exception;

import java.sql.Date;

public class Stack {
	
	static Contact contact[] ;
	static int top =-1;
	
	public void push(Contact c) {
		if(contact==null) {
			System.out.println("Push Failed - Unintialized Stack");
		}
		else if (top==((contact.length)-1)) {
			System.out.println("Stack is full");
		}else {
			contact[++top] =c;
			System.out.println(c +" pushed into stack");
		}
	}
	
	public void pop() {
		if(contact==null) {
			System.out.println("Pop Failed - uninitialized stack");
		}else if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println(contact[top]+" popped out from stack");
			contact[top] = null;
			top--;
		}
	}
	
	public void display() {
		System.out.println("--------Stack:-------------");
		for(Contact c:contact) {
			if(c!=null)
			System.out.println(c);
		}
		System.out.println("----------end--------------");
	}
	
public static void main(String[] args) {
	Stack obj = new Stack();
	Contact c = new Contact("a", "a", "a", "female", "a", "a", "a", 654123, "a", "a", Date.valueOf("2020-09-09"), Date.valueOf("2021-02-02"), "9876543210", "9871230985", "abc@gmail.com", "abc.com");
	obj.push(c);
	obj.pop();
	contact = new Contact[3];
	c = new Contact("a", "a", "a", "female", "a", "a", "a", 654123, "a", "a", Date.valueOf("2020-09-09"), Date.valueOf("2021-02-02"), "9876543210", "9871230985", "abc@gmail.com", "abc.com");
	obj.push(c);
	obj.display();
	
	c = new Contact("b", "b", "b", "female", "b", "b", "b", 613453, "b", "b", Date.valueOf("2010-01-19"), Date.valueOf("2021-02-02"), "9876543210", "9871230985", "c23@gmail.com", "fgc.com");
	obj.push(c);
	obj.display();
	
	c = new Contact("c", "c", "c", "male", "c", "c", "c", 654123, "c", "c", Date.valueOf("2020-09-09"), Date.valueOf("2021-02-02"), "9876543210", "9845673246", "gtg@gmail.com", "gre.com");		
	obj.push(c);
	obj.display();
	
	obj.push(c);
	
	obj.pop();
	obj.display();
	
	obj.pop();
	obj.display();
	
	obj.pop();
	obj.display();
	
	obj.pop();
}
}
