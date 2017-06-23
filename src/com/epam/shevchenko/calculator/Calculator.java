package com.epam.shevchenko.calculator;

import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.Region;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberUtil;

public abstract class Calculator {

	// task 01
	// Checks if the sum of the first two digitals is equal to the sum of
	// the last two
	public static boolean isFirstSumEqToLastSum(int numberToAnalyse) {

		int x = (int) (Math.log10(numberToAnalyse) + 1) / 2;
		int rate = (int) (Math.pow(10, x));

		int firstNumberPart = numberToAnalyse / rate;
		int secondNumberPart = numberToAnalyse % rate;

		return (NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart));
	}

	// task 02
	// (b + КОРЕНЬ(b2 + 4ac))/2a - a3c +b-2

	public static double calculateComplexFormula(int[] input) {

		int a = input[0];
		int b = input[1];
		int c = input[2];

		return ((b + Math.pow((b * b + 4 * a * c), 0.5)) / (2 * a) - c * Math.pow(a, 3) + Math.pow(b, -2));
	}

	// task 03
	public static double calculatePerimetr(int a, int b, double c) {
		return (a + b + c);
	}

	public static double calculateSquare(int a, int b) {
		return (a * b / 2);
	}

	// task 04
	// checks if a point is situated in region
	public static boolean isPointInRegion(Point p, Region region) {
		if ((p.getX() >= region.getX1()) && (p.getX() <= region.getX2())) {
			if ((p.getY() >= region.getY1()) && (p.getY() <= region.getY2())) {
				return true;
			}
		}
		return false;
	}

	// task 05
	// takes in 2 pow if number is not negative else in 4 pow
	public static double exponentiateAccordingPositivity(double number) {
		double result = 0;
		if (number >= 0) {
			result = Math.pow(number, 2);
		} else {
			result = Math.pow(number, 4);
		}
		return result;
	}

	// task 06
	// take a sum of min and max value of array
	public static int sumTheBiggestAndTheSmallest(int[] array) {
		return array[0] + array[array.length - 1];
	}

	// task 07
	// F(x) = sin^2(x)-cos(2x)
	public static double trigonometricFunction(double x) {
		return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
	}

	// task 08
	// finds sum of elements that are multiple to k
	public static int sumNaturalNumbersMultipleK(int[] massive, int k) {
		int result = 0;

		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % k == 0) {
				result += massive[i];
			}
		}
		return result;
	}

	// task 09
	// Concatenates two unidimensional arrays after specified index
	public static int[] concatArrays(int[] array1, int[] array2, int k) {
		int[] result = new int[array1.length + array2.length];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = array1[i];
			} else if (i < k + array2.length) {
				result[i] = array2[i - k];
			} else {
				result[i] = array1[i - array2.length];
			}
		}
		return result;
	}

	// task 10
	/*
	 * creates an array according rules
	 * 
	 * (1 2 3 .. n) (n n-1 n-2.. 1) (1 2 3 .. n) (n n-1 n-2.. 1)
	 * (................) (1 2 3 .. n) (n n-1 n-2.. 1)
	 * 
	 */
	public static int[][] createMatrix(int n) {

		if (n > 0 && n % 2 == 0) {

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
		} else {
			throw new IncorrectDataException("Enter one positive even number", new String[] { String.valueOf(n) });
		}

	}
}
