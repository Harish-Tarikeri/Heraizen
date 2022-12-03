package com.uis.Heraizen;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovedDuplicatesUsingSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give input String : ");
		String input = sc.next();
		Set<Character> st = new LinkedHashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			st.add(input.charAt(i));
		}
		System.out.print("The result is : ");
		for (Character c : st) {

			System.out.print(c);
		}
		sc.close();
	}

}
