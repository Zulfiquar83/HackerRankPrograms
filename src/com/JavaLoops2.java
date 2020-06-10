package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<List<Integer>> queriesParam = new ArrayList<List<Integer>>();
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			List<Integer> seriesParam = new ArrayList<Integer>();
			seriesParam.add(a);
			seriesParam.add(b);
			seriesParam.add(n);

			queriesParam.add(seriesParam);
		}
		in.close();

		boolean isValidInput = false;
		if (t >= 0 && t <= 500) {
			for (List<Integer> query : queriesParam) {
				int a = query.get(0);
				int b = query.get(1);
				int n = query.get(2);

				if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50)) {
					if (n >= 1 && n <= 15) {
						isValidInput = true;
					}

				}
			}
		}
		if (isValidInput) {
			for (List<Integer> query : queriesParam) {

				int a = query.get(0);
				int b = query.get(1);
				int n = query.get(2);
				int temp = 0;
				for (int j = 0; j < n; j++) {
					temp += Math.pow(2, j) * b;
					int finalValue = temp + a;
					System.out.print(finalValue + " ");
				}
				System.out.println();
			}
		}
	}
}
