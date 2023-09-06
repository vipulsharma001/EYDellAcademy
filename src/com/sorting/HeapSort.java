package com.sorting;

public class HeapSort {

	static void heapsort(int[] arr) {
		int len = arr.length;
		for (int i = (len / 2) - 1; i >= 0; i--) {
			heapify(arr, len, i);

		}
		for (int i = len - 1; i >= 0; i--) { // move current root element to end and swap arr[0] with eleemnt
													// arr[l-1]
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	static void heapify(int[] arr, int l, int i) {
		int largestElement = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// if left child is greater than root
		if (left < l && arr[left] > arr[largestElement]) {
			largestElement = left;
		}

		// if right child is greater than root
		if (right < l && arr[right] > arr[largestElement]) {
			largestElement = right;
		}
		if(largestElement != i)
		{
			int temp = arr[i];
			arr[i] = arr[largestElement];
			arr[largestElement] = temp;
			
			
			heapify(arr, l, largestElement);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 21, 23, 43, 20, 45, 54, 71, 29 };
		System.out.println("Array before Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		heapsort(arr);
		System.out.println();
		System.out.println("Array After Sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
