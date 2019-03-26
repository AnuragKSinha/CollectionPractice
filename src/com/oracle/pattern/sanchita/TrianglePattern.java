package com.oracle.pattern.sanchita;

public class TrianglePattern {
	public static void main(String args[]) {
		int input = 4;
		for (int i = 1; i <=input; i++) {
			for (int j = 0; j < (input - i) * 2; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
