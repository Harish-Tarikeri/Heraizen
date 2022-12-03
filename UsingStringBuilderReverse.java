package com.uis.Heraizen;

import java.util.Scanner;

public class UsingStringBuilderReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string line");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				sb.append(arr[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println(sb);

		sc.close();

	}

}
