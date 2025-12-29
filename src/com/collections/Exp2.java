package com.collections;

import java.util.Stack;

public class Exp2 {

	public static void main(String[] args) {
		
		Stack data = new Stack();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add(1200);
		data.add(23.33d);
		data.add(22.22f);
		data.add(false);
		
		System.out.println(data);
		
		System.out.println(data.peek());
		
		data.push(1000);
		
		System.out.println(data.peek());
		
		data.pop();
		
		System.out.println(data);
		
		System.out.println(data.search('a'));
		
		System.out.println(data.contains(101));
		
		data.clear();
		
		System.out.println(data.empty());
	}

}
