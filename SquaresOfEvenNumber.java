package com.uis.Heraizen;

import java.util.Scanner;
/*i/p=size of an array & elements
 * o/p=return square of a number if the element in an array is even
 */

public class SquaresOfEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] * arr[i]);
			}

		}
		sc.close();
	}

}
