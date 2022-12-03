package com.uis.Heraizen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToArrayListConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str1));
		for (String s : al) {
			System.out.println(s);

		}
		sc.close();

	}

}
