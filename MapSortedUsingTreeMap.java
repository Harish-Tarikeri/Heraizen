package com.uis.Heraizen;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapSortedUsingTreeMap {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter size of element");
		int size = sc1.nextInt();
		Map<String, String> mp = new TreeMap<String, String>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Key Element");
			String key = sc2.next();
			System.out.println("Enter Value Elements");
			String value = sc2.next();
			mp.put(key, value);
		}
		System.out.println("Sorted by key = " + mp);

		sc1.close();
		sc2.close();
	}

}
