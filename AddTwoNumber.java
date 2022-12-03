package com.uis.Heraizen;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		// Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter input a: ");
		int a = sc1.nextInt();
		System.out.print("Enter Input b: ");
		int b = sc1.nextInt();
		int total = a + b;
		System.out.println("total of two inputs = " + total);
		sc1.close();
		// sc2.close();

	}

}
