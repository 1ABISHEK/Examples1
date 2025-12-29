package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exp3 {

	public static void main(String[] args) {
		
//		HashSet data = new HashSet();
		LinkedHashSet data = new LinkedHashSet<>();
//		TreeSet data = new TreeSet<>();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add(1200);
		data.add("java");
		data.add(23.33d);
		data.add(22.22f);
		data.add(false);
		
		System.out.println(data);
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
