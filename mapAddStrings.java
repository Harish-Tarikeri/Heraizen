package com.uis.Heraizen;

import java.util.HashMap;
import java.util.Scanner;

public class mapAddStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter size of element");
		int n = sc1.nextInt();
		HashMap<String, String> hs = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Key Elements");
			String key = sc.next();
			System.out.println("Enter value ekements");
			String value = sc.next();

			hs.put(key, value);
		}

		System.out.println("key value in map = " + hs);
		sc.close();
		sc1.close();
	}

}
