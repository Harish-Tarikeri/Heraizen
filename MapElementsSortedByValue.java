package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapElementsSortedByValue {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter size of Element");
		int size = sc1.nextInt();
		Map<String, String> mp = new HashMap<String, String>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Key Element");
			String key = sc2.next();
			System.out.println("Enter Value Element");
			String value = sc2.next();

			mp.put(key, value);

		}
		System.out.println("Unsorted by value = " + mp);

		Set<Entry<String, String>> st = mp.entrySet();
		List<Entry<String, String>> lt = new ArrayList<Entry<String, String>>(st);

		Collections.sort(lt, new Comparator<Entry<String, String>>() {
			public int compare(Entry<String, String> e1, Entry<String, String> e2) {
				return (e1.getValue().compareTo(e2.getValue()));
			}
		}

		);
		System.out.println("New Sorted bed on value" + lt);

		sc1.close();
		sc2.close();

	}

}
