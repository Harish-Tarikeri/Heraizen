package com.uis.Heraizen;

import java.util.HashMap;
import java.util.Scanner;

public class mapAddInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		System.out.println("Enter Size of element");
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Key Elements");
			int m = sc.nextInt();
			System.out.println("Enter Value elements");
			int n = sc.nextInt();
			hm.put(m, n);
		}
		System.out.println("Elements in HashMap = " + hm);

		sc.close();

	}

}
