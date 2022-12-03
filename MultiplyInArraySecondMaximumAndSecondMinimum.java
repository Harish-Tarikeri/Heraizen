package com.uis.Heraizen;

import java.util.Scanner;

public class MultiplyInArraySecondMaximumAndSecondMinimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Element");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " elemnets");
		int[] arr = new int[size];
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int sort : arr) {
			System.out.println("Arrays sort = " + sort );
		}
		System.out.println("result of of sec max and sec min number in array = " + arr[1] *(arr[arr.length-2]));
		
		sc.close();

	}

}
