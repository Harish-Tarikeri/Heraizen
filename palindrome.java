package com.uis.Heraizen;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.next();
		String reverse = "";
		for (int i = input.length()-1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		if (input.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Its not a palindrome");
		}
		sc.close();
	}
}
