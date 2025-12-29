package com.sortings;

public class BubbleSort {

	public static void sortElements(int[] arr) {

		int n = arr.length;

		int t = 0;

		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
	
	public static void displayElements(int []arr) {
		for(int dt:arr) {
			System.out.println(dt+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []arr = {5,1,12,-5,16};
		
		displayElements(arr);
		
		sortElements(arr);
		
		displayElements(arr);
	}
}
