package interviewPreparationKit.warmupchallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

	static boolean isValidInput = true;

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int n = c.length;
		int init = 0;
		int i = 0;
		int minStep = 0;
		if (isValidInput) {
			while (i < n && i + 1 < n) {
				/*
				 * if (i == 0) { minStep += 1; i++; continue; }
				 */
				if (i + 2 < n && c[i + 2] == 0) {
					i = i + 2;
					if (i > n) {
						minStep += 2;
						break;
					} else {
						minStep += 1;
						continue;
					}

				}
				if (c[i + 1] == 0) {
					minStep += 1;
					i = i + 1;
					continue;
				}
			}
		}

		return minStep;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (n < 2 || n > 100)
			isValidInput = false;

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			if (cItem != 0 && cItem != 1)
				isValidInput = false;
			c[i] = cItem;
		}
		if (c[0] != 0 && c[n - 1] != 0)
			isValidInput = false;

		int result = jumpingOnClouds(c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
