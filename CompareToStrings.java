package com.uis.Heraizen;

import java.util.Scanner;

public class CompareToStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String input1 = sc.nextLine();
		System.out.println("Enter second String");
		String input2 = sc.nextLine();
		if(input1.compareTo(input2)>0) {
			System.out.println(input1 + " bigger than " + input2);
		}else if(input1.compareTo(input2)<0) {
			System.out.println(input1 + " lesser than " + input2);
		}else {
			System.out.println("both input's are equal");
		}
		sc.close();
	}

}
