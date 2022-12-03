package com.uis.Heraizen;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit : ");
		int n = sc.nextInt();
		float temperature = n;
		temperature = ((temperature - 32) * 5) / 9;
		System.out.println("temperature in celcius = " + temperature);
		sc.close();
	}
}
