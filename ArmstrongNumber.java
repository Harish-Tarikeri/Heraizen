package com.uis.Heraizen;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Give integer number : ");
		int n = sc.nextInt();
		while (n > 0) {
			int remainder = n % 10;
			remainder = remainder * remainder * remainder;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println("The value of armstrong number is : " + sum);
		sc.close();
	}

}
