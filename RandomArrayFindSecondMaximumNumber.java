package com.uis.Heraizen;

import java.util.Scanner;

public class RandomArrayFindSecondMaximumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		FindSecondMaximumNumber(arr);
		System.out.println("Second Biggest Number is = " + arr[arr.length-2]);
		
		sc.close();
	}

	private static int FindSecondMaximumNumber(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++)
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
			}
		}	
		return (arr[arr.length - 2]);
	}
	
}
