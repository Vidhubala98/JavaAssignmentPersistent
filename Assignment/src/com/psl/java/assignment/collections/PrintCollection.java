package com.psl.java.assignment.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PrintCollection {
public static void main(String[] args) {
	ArrayList<String> m = new ArrayList<>();
	m.add("a");
	m.add("iiii");
	display(m);
	HashSet<Integer> s = new HashSet<>();
	s.add(1);
	display(s);
	
}

public static <T> void display(Collection<T> c) {
	System.out.println(c);
}
}
