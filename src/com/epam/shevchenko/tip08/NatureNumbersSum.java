package com.epam.shevchenko.tip08;

import com.epam.shevchenko.util.NumberUtil;

public class NatureNumbersSum {
	private static int k = 3; // programm data

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			if (!NumberUtil.isDigital(args[i])) {
				System.out.println("Input should have only natural digitals!");
				return;
			}
		}

		int[] massive = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			massive[i] = Integer.parseInt(args[i]);
		}

		
		//Print the input array
		System.out.print("Array is given: " );
		for (int i = 0; i < massive.length; i++) {
			System.out.print(" " + massive[i]);
		}
	
		System.out.println("\nThe sum of numbers, that are multiple to " + k + " = " + sumNumbers(massive, k));
	}

	public static int sumNumbers(int[] massive, int k2) {
		int result = 0;

		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % k == 0) {
				result += massive[i];
			}
		}
		return result;
	}

}
