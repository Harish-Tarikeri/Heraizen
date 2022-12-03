package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String size of elment");
		String str = sc.nextLine();
		System.out.println("Enter String elements");
		String[] str2 = str.split(" ");

		ArrayList<String> animals = new ArrayList<String>();
		for (int i = 0; i < str2.length; i++) {
			animals.add(sc.nextLine());
		}
		String[] str1 = new String[animals.size()];
		for (int i = 0; i < animals.size(); i++) {
			str1[i] = animals.get(i);
		}

		for (String s : str1) {
			System.out.println(s);
		}
		Collections.sort(animals);

		System.out.println(animals);
		sc.close();
	}

}
