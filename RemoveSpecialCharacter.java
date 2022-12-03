package com.uis.Heraizen;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give String including speacial character");
		String str = sc.next();
		String st1  = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("st1 = " + st1);
		
		sc.close();
	}

}
