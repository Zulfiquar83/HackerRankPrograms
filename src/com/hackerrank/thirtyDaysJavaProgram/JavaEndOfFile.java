package com.hackerrank.thirtyDaysJavaProgram;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		List<String> lines = new ArrayList<String>();
		while(sc.hasNext())
		{
			lines.add(sc.nextLine());
		}
		int i = 1;
		for(String line : lines)
		{
			System.out.println(i++ + " " +  line);
		}
	}

}
