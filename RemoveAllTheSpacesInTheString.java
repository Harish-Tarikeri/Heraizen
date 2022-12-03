package com.uis.Heraizen;

import java.util.Scanner;

public class RemoveAllTheSpacesInTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give input string line");
		String str = sc.nextLine();
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		sc.close();
	}
}
