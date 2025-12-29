package com.exp;

import java.util.Arrays;
import java.util.List;

public class Exp15 {

	public static void main(String[] args) {
		String[] names = {"rohit","kohli","dhoni","dravid","sky"};
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		System.out.println("---------------------------------------------");
		System.out.println("Using Enhanced Loop");
		System.out.println("---------------------------------------------");
		for(String dt : names) {
			System.out.println(dt);
		}
		System.out.println("---------------------------------------------");
		System.out.println("Arrays List");
		List<String> list = Arrays.asList(names);
		
		list.forEach(x -> System.out.println(x));
		
//		list.forEach(System.out::print(x));
		System.out.println("---------------------------------------------");
	}

}
