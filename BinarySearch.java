package com.uis.Heraizen;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < (size - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int x = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = x;
				}
			}
		}

		System.out.println("Now the sorted array is : ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.print("Enter an element to search : ");
		int search = sc.nextInt();
		int first = 0;
		int last = size - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
			if (arr[middle] < search) 
				first = middle + 1;
			 else if (arr[middle] == search) {
				System.out.println("The element found at index no " + middle + "position no " + (middle + 1));
				break;
			} else
				last = middle - 1;

			middle = (first + middle) / 2;
		}
		if (first > last) {
			System.out.println("The element is not available in given array");
		}
		sc.close();
	}
}
