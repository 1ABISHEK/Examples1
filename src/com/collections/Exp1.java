package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exp1 {

	public static void main(String[] args) {
		
//		List data = new ArrayList();
//		ArrayList data = new ArrayList();
		
		CopyOnWriteArrayList data = new CopyOnWriteArrayList();
		
		data.add(1000);
		data.add("java");
		data.add('a');
		data.add(1200);
		data.add(23.33d);
		data.add(22.22f);
		data.add(false);
		
		System.out.println(data);
		
		//Iterator, List Iterator and Enumeration
		
		ListIterator itr = data.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println(data.size());
		
		//Copy On Write ArrayList
		
		
	}

}
