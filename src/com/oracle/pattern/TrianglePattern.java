package com.oracle.pattern;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:: ");
		patternPrinter(Integer.parseInt(sc.nextLine()));
	}

	private static void patternPrinter(int n) {
		System.out.println("hello4");
		int c=1;
		for (int j = 0; j < n; j++) {
			for (int i = n - j - 1; i > 0; i--) {
				System.out.print("  ");
			}
			for (int k = 0; k<c; k++) {
				System.out.print((k+1) + " ");
			}
			c=c+2;
			System.out.println();
		}
	}

}
