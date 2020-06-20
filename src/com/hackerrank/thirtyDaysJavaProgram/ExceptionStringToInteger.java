package com.hackerrank.thirtyDaysJavaProgram;

import java.util.Scanner;

public class ExceptionStringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		try {
			if (S.length() < 0 && S.length() > 6)throw new Exception();
			if (!S.matches("^[a-z0-9]*")) throw new Exception();
			System.out.println(Integer.parseInt(S));
		} catch (Exception e) {
			System.out.println("Bad String");
		} 
	}
}
