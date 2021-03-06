package com.hackerrank.thirtyDaysJavaProgram;
import java.util.Scanner;

public class JavaDatTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
					System.out.println(x + " can be fitted in:");
					if (x >= -128 && x <= 127) {
						System.out.println("* byte");
					}
					if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
						System.out.println("* short");
					}
					if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
						System.out.println("* int");
					}
					System.out.println("* long");
				} else {
					System.out.println(x + " " + "can't be fitted anywhere.");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

}
