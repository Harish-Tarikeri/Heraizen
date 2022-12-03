package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistAddremove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			al.add(str[i]);
		}
		System.out.println("enter which element you want remove");
		String str1 = sc.nextLine();
		if (al.remove(str1)) {
			System.out.println("Removed element successfully");
		} else {
			System.out.println("element is not in the list");
		}
		System.out.println(al);

		sc.close();

	}

}
