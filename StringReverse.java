package com.uis.Heraizen;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give input string");
		String str = sc.nextLine();
		char[] str1 = str.toCharArray();
		String rev = "";
		for (int i = str1.length - 1; i >= 0; i--) {
			rev = rev + str1[i];
		}
		System.out.println(rev);
		sc.close();
	}
}
