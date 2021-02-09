package com.psl.java.assignment.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {
	Map<String,Set<Character>> map = new HashMap<>();
	public static void main(String[] args) {
		UniqueCharacter obj = new UniqueCharacter();
		System.out.println(obj.toUniqueChar("aasdf"));
		System.out.println(obj.toUniqueChar("aasdf"));
		System.out.println(obj.toUniqueChar("hiiiii"));
	}
	public Set<Character> toUniqueChar(String s){
		Set<Character> ch = new HashSet<>();
		if(map.get(s)!=null) {
			return map.get(s);
		}else {
			for(char i:s.toCharArray()) {
				ch.add(i);
			}
			map.put(s, ch);
			return ch;
		}
	}
}
