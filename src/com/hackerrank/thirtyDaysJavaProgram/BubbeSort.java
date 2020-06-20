package com.hackerrank.thirtyDaysJavaProgram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbeSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isValidInput = true;
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			if (a[a_i] < 1 || a[a_i] > 2 * (Math.pow(10, 6))) {
				isValidInput = false;
			}
		}
		// Write Your Code Here
		if (n >= 2 && n <= 600 && isValidInput) {
			int numSwaps = 0;
			int firstElement = 0;
			int lastElement = 0;

			for (int i = 0; i < n; i++) {
				// Track number of elements swapped during a single array
				// traversal

				for (int j = 0; j < n - 1; j++) {
					// Swap adjacent elements if they are in decreasing order
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
						numSwaps++;
					}
				}

				// If no elements were swapped during a traversal, array is
				// sorted
				if (numSwaps == 0) {
					break;
				}
			}

			System.out.println("Array is sorted in " + numSwaps + " swaps.");
			System.out.println("First Element: " + a[0]);
			System.out.println("Last Element: " + a[a.length - 1]);
		}
	}
}
