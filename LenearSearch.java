package com.uis.Heraizen;

import java.util.Scanner;

public class LenearSearch {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			System.out.println("Enter length elements");
			int length = sc.nextInt();
			int[] linearsearch = new int[length];
			System.out.println("Enter " + length + " elements");
			for (i = 0; i < length; i++) {
				linearsearch[i] = sc.nextInt();
			}
			System.out.println("Enter the search element");
			int search = sc.nextInt();
			for (i = 0; i < length; i++) {
				if (linearsearch[i] == search) {
					System.out.println(search + " is prasent at the location " + (i + 1));
					break;
				}
			}
			if (i == length) {
				System.out.println(search + " doesn't exist in array");
			}
			 sc.close();
		}
	}

}
