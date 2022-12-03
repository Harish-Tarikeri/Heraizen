package com.uis.Heraizen;

import java.util.Scanner;

public class GenerateRandomString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of element");
		int size = sc.nextInt();
		String result = null;

		result = generateRandomStirng(size);
		System.out.println("RandomString = " + result);
		sc.close();
	}

	private static String generateRandomStirng(int size) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		String str1 = "";
		for (int i = 0; i < size; i++) {
			int randomString = (int) (str.length() * Math.random());
			char ch = str.charAt(randomString);
			str1 = str1 + ch;
		}
		return str1;
	}

}
