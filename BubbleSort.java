package com.uis.Heraizen;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of integer to sort : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter " + n + " integer");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					int swap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = swap;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}
}
