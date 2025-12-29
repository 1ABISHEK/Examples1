package com.streams;

import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sky", "kohli", "dravid", "rohit", "dhoni");
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("===================================================");
		
		names.stream().map(String::toLowerCase).forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(2,3,4,6,8);
		
		System.out.println("===================================================");
		
		nums.stream().map(x -> x*x).forEach(System.out::println);
	}
}
