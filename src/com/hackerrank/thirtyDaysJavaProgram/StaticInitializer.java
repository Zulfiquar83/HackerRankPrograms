package com.hackerrank.thirtyDaysJavaProgram;
import java.util.Scanner;

public class StaticInitializer {
	static boolean flag;
	static int B;
	static int H;
	static {
		flag = true;
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		try {
			if (B <= -100 || B >= 100 || H <= -100 || H >= 100) {
				flag = false;
			}
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception();
			}
		} catch (Exception e) {
			System.out
					.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}
