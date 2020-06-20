package interviewPreparationKit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValley {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		boolean isValidInput = true;
		int numberOfValleys = 0;

		// checking validity of input
		if (n < 2 || n > Math.pow(10, 6) || !s.matches("[UD]+"))
			isValidInput = false;

		if (isValidInput) {
			int tempStep = 0;
			boolean mountain = false;
			for (char step : s.toCharArray()) {
				if (step == 'U') {
					if (tempStep == 0)
						mountain = true;
					tempStep += 1;
				} else {
					if (tempStep == 0)
						mountain = false;
					tempStep -= 1;
				}
				if (tempStep == 0 && !mountain) {
					numberOfValleys += 1;
				}
			}
			return numberOfValleys;
		} else
			return -1;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
