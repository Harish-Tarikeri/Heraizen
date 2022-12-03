package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSizeFound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			al.add(str[i]);
		}
		System.out.println("ArrayList size of elements = " + al.size());
		sc.close();

	}

}
