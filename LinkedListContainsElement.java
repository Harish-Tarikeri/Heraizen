package com.uis.Heraizen;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListContainsElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		List<String> ll = new LinkedList<String>();
		for (int i = 0; i < str.length; i++) {
			ll.add(str[i]);
		}
		System.out.println("Enter which element is contain");
		String str1 = sc.nextLine();
		if (ll.contains(str1)) {
			System.out.println("Element is present in list");
		} else {
			System.out.println("Element is not in the list");
		}

		sc.close();

	}

}
