package com.epam.shevchenko.tip10;

public class TheMatrix {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Input should have one parameter!");
			return;
		}

		int n = Integer.parseInt(args[0]);

		if (n % 2 != 0) {
			System.out.println("Input should have be even number!");
			return;
		}

		int[][] matrix = new int[n][n];

		for (int i = 1; i <= n; i++) {
			matrix[0][i - 1] = i;
			matrix[1][i - 1] = n - i + 1;
		}

		for (int i = 2; i < n; i += 2) {
			matrix[i] = matrix[0].clone();
			matrix[i + 1] = matrix[1].clone();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}
}