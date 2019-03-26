package com.durga.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

	public static void main(String arg[]) {
		int a[] = { 1, 2, 4, 5, 6, 7, 8,9 ,25,121};
		List<Integer> magicnumber=new ArrayList<Integer>();
		int count = 0;

		findMagical(a, magicnumber);
		System.out.println("");
		
		
		

	}

	static void findMagical(int p[], List<Integer> magicnumber) {
		// double sqrt = Math.floor(Math.sqrt(n));
		for (int n : p) {
			double sqrt = Math.floor(Math.sqrt(n));
			if (n==1||!(n / sqrt == sqrt)) {
				continue;
			} else {
				for (int i = 2; i < sqrt; i++) {
					if (n % i == 0) {
						continue;
					}
				}
				magicnumber.add(n);
				continue;
			}
		}
	}
}
