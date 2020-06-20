package randomPicks;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EmmaSumOfProducts {

	// Complete the solve function below.
	
	static int getFactorial(int fact)
	{
		if(fact == 0 || fact == 1)
			return 1;
		fact = fact * getFactorial(fact - 1);
		return fact;
	}
	
	static int[] solve(int[] A, int[] queries) {
		
		//check if input is valid
		boolean isValidInput = true;
		if (A.length < 1 || A.length > (3 * 10 ^ 4))
			isValidInput = false;
		if (queries.length < 1 || queries.length > A.length)
			isValidInput = false;
		for (int temp : A) {
			if (temp < 1 || temp > (10 ^ 5))
				isValidInput = false;
		}
		for (int temp : queries) {
			if (temp < 1 || temp > A.length)
				isValidInput = false;
		}
		
	

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int ACount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] A = new int[ACount];

		String[] AItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < ACount; i++) {
			int AItem = Integer.parseInt(AItems[i]);
			A[i] = AItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] queries = new int[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			int queriesItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			queries[i] = queriesItem;
		}

		int[] result = solve(A, queries);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
