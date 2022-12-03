package com.uis.Heraizen;

import java.util.Scanner;

public class AddTwoMatrixUsingTwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row and columns of matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				first[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				second[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("Sum of two matrix is : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(sum[i][j] + "\t");
			}
		}
		System.out.println();

		sc.close();
	}

}
