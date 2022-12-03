package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExamplemethodSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of elements : ");
		int m = sc.nextInt();
		System.out.println("Enter elemnents");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			al.add(sc.nextInt());
		}
		for (Integer i : al) {
			System.out.println(i);
		}
		Collections.sort(al);
		System.out.println("Sorted araylist = " + al);
		sc.close();
	}

}
