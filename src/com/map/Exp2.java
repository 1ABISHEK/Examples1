package com.map;

import java.util.TreeMap;

public class Exp2 {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> data = new TreeMap<>();
		
		data.put("Orange", 200);
		data.put("Banana", 25);
		data.put("Sprouts", 45);
		data.put("Orange", 250);
		data.put("Millets", 110);
		data.put("Mango", 210);
		data.put("Apple", 250);
		data.put("Mango", 180);
		data.put("Zen", 33);
		
		data.forEach((k,v) -> System.out.println("Item : "+ k + " Price : "+ v));
	}
}
