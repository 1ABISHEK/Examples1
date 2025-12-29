package com.dtm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exp3 {

		private static double add(List<? extends Number> list)
		{
			double a = 0;
			
			for(Number n : list) {
				a = n.doubleValue();
				a += a;
			}
			return a;
		}
		
		//lower bound
		public static void lowerBounded(List<? super Integer> list) {
			System.out.println(list);
		}
		
		//unbounded wildcards
		public static void unBounded(List<?> list) {
			System.out.println(list);
		}
		
		public static void main(String[] args) {
			//upper bounded
			
			List<Integer> list1 = Arrays.asList(12,3,4,5);
			add(list1);
			
			List<Double> list2 = Arrays.asList(34.44,12.00,55.44);
			add(list2);
			
			lowerBounded(list1);
			
			unBounded(list2);
			
			List<String> names = Arrays.asList("java","python","spring");
			
		}
	}

