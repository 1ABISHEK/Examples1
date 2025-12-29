package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Exp4 {
	public static void main(String[] args) {
		TreeSet<String> data = new TreeSet<>();
		
		data.add("java");
		data.add("python");
		data.add("go lang");
		data.add("typescript");
		data.add("angular");
		data.add("java");
		data.add("php");
		data.add("react");
		
		Iterator<String> itr = data.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(data.subSet("go lang",false,"python",false ));
		
		System.out.println(data.ceiling("python"));
		
		System.out.println(data.higher("java"));
		
		System.out.println(data.floor("java"));
	}
}
