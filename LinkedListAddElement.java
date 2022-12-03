package com.uis.Heraizen;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListAddElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		List<String> ll = new LinkedList<String>();
		for (int i = 0; i < str.length; i++) {
			ll.add(str[i]);
		}
		for (String s : ll) {
			System.out.println(s);
		}
		System.out.println("added elements to the linkedlist = " + ll);

		sc.close();

	}

}
