package com.uis.Heraizen;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetIteratorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements : ");
		int m = sc.nextInt();
		System.out.println("Enter elements");
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			hs.add(sc.nextInt());
		}
		for (Integer i : hs) {
			System.out.println(i);
		}
		sc.close();
	}

}
