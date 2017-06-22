package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;

public class TheMatrix extends BaseCalculator {

	public TheMatrix(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkDigitalArgs(input, 1)) {
			message += "Error! Incorrect input!";
			return message;
		}

		int n = Integer.parseInt(input[0]);

		if (n % 2 != 0 || n < 0) {
			message += "Input should be an positive even number!";
			return message;
		}

		printMatrix(createMatrix(n));
		return message;

	}

	public void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				message += matrix[i][j];
			}
			message += "\n";
		}

	}

	public static int[][] createMatrix(int n) {

		int[][] matrix = new int[n][n];
		for (int i = 1; i <= n; i++) {
			matrix[0][i - 1] = i;
			matrix[1][i - 1] = n - i + 1;
		}

		for (int i = 2; i < n; i += 2) {
			matrix[i] = matrix[0].clone();
			matrix[i + 1] = matrix[1].clone();
		}

		return matrix;
	}
}