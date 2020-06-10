package com;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'diagonalDifference' function below.
	 * 
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		int columnNo = 0;
		int leftToRightDiagonal = 0;
		int rightToLeftDiagonal = 0;
		int difference = 0;
		boolean isValidInput = true;
		for (List<Integer> row : arr) {
			for (Integer column : row) {
				if (column < -100 || column > 100) {
					isValidInput = false;
					break;
				}
			}
		}
		if (isValidInput) {
			for (List<Integer> row : arr) {

				leftToRightDiagonal += row.get(columnNo);
				rightToLeftDiagonal += row.get(row.size() - columnNo - 1);
				columnNo++;

			}
		}
		difference = Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
		return difference;

	}
}

public class DiagonalDifference {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(
				i -> {
					try {
						arr.add(Stream
								.of(bufferedReader.readLine()
										.replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt).collect(toList()));
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
