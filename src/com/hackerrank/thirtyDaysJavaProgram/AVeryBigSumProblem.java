package com.hackerrank.thirtyDaysJavaProgram;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AVeryBigSumProblem {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		boolean isValidInput = true;
		long bigSumValue = 0;
		if (ar.length < 1 && ar.length > 10)
			isValidInput = false;
		for (long i : ar) {
			if (i < 0 && i > Math.pow(10, 10)) {
				isValidInput = false;
				break;
			}
		}
		if (isValidInput) {
			for (long i : ar) {
				bigSumValue += i;
			}
		}
		return bigSumValue;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long[] ar = new long[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arItems[i]);
			ar[i] = arItem;
		}

		long result = aVeryBigSum(ar);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
