package com.uis.Heraizen;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetContainsExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		System.out.println(hs);
		System.out.println("which element do u want to find???");
		String str2 = sc.nextLine();
			if (hs.contains(str2)) {
				System.out.println("String found in the set of elements");	
			} else {
				System.out.println("String not found in the set of elements");
		}
		sc.close();
	}
}
