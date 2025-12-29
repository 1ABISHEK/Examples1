package com.dtm;

import java.util.ArrayList;

public class Exp2 {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		
		data.add("php");
		data.add("Java");
		data.add("python");
		data.add("java");
		data.add("AI");
		data.add("spring");
		
		for(String dt:data) {
			System.out.println(dt.startsWith("p"));
		}
		
	}

}
