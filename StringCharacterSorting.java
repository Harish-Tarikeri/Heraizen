package com.uis.Heraizen;

import java.util.Arrays;
import java.util.Scanner;

public class StringCharacterSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		String str = sc.next();
		char ch[] = str.toCharArray();
		char temp;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("Result is  = " + new String(ch));
		
		
		Arrays.sort(ch);
		System.out.println("Using dataStructure of array = " + new String(ch));
		sc.close();
	}

}
