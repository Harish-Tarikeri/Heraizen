package com.uis.Heraizen;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListRemoveElementAndAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("add elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		List<String> ll = new LinkedList<String>();
		for (int i = 0; i < str.length; i++) {
			ll.add(str[i]);
		}
		System.out.println("Enter which element you want remove");
		String str1 = sc.nextLine();
		if (ll.remove(str1)) {
			System.out.println("Element removed successfully from list");
		} else {
			System.out.println("Element is not in the list");
		}
		System.out.println("Elements in the list = " + ll);

		sc.close();

	}

}
