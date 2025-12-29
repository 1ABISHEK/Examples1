package com.sortings;

public class InsertionSorting {

	public static void sortElements(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int k = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > k) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = k;
		}
	}

	public static void displayElements(int arr[]) {
		for (int dt : arr) {
			System.out.println(dt + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int [] arr = {5,2,4,6,1,5};
		
		//before sorting
		displayElements(arr);
		
		sortElements(arr);
		
		//after sorting
		displayElements(arr);

	}

}
