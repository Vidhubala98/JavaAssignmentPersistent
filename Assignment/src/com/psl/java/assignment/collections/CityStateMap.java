package com.psl.java.assignment.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CityStateMap {
	Map<String,List<String>> stateCity = new HashMap<String, List<String>>();

	public Map<String, List<String>> getStateCity() {
		return stateCity;
	}

	public void setStateCity(Map<String, List<String>> stateCity) {
		this.stateCity = stateCity;
	}

	public CityStateMap(Map<String, List<String>> stateCity) {
		super();
		this.stateCity = stateCity;
	}

	public CityStateMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CityStateMap [stateCity=" + stateCity + "]";
	}
	
	public static void main(String[] args) {
		Map<String,List<String>> stateCity = new HashMap<String, List<String>>();
		List<String> city ;
		try {
			String s1,state,s2[];
			int i;
			BufferedReader br = new BufferedReader(new FileReader("E:\\Java_Assignment\\Assignment\\src\\com\\psl\\java\\assignment\\collections\\citystate.txt"));
			while((s1=br.readLine())!=null) {
				i=1;
				city = new ArrayList<String>();
				s2 = s1.split("-");
				state = s2[0];
				while(s2.length>i) {
					city.add(s2[i]);
					i++;
				}
				stateCity.put(state, city);
			}
			
			System.out.println(stateCity);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1.	Get all cities");
		for(Map.Entry<String, List<String>> m1:stateCity.entrySet()) {
			System.out.println(m1.getValue());
		}
		
		 System.out.println("2.	Get All states"+stateCity.keySet());
		 
		 System.out.println("3.	Get cities for a state");
		 for(Map.Entry<String, List<String>> m1:stateCity.entrySet()) {
				System.out.println(stateCity.get(m1.getKey()));
			}
		System.out.println("4.	Add new city state pair");
		stateCity.put("Andhra",Arrays.asList("Vijayawada","tirupathi"));
		System.out.println(stateCity);
		
		System.out.println("5.	Delete all the cities for a given state");
		stateCity.put("Andhra",null);
		System.out.println(stateCity);
	}
	
	
	
}
