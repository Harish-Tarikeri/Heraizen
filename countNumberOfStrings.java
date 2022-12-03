package com.uis.Heraizen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countNumberOfStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String n = sc.nextLine();
		String[] words = n.split(" ");
		int count = 1;
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if ((wordcount.containsKey(words[i])) == false) {
				wordcount.put(words[i], count);
			} else {
				wordcount.put(words[i], wordcount.get(words[i]) + count);
			}
		}
		System.out.println(wordcount);
		sc.close();
	}

}
