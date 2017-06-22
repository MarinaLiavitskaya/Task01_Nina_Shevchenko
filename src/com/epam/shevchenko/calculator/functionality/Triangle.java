package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;

public class Triangle extends BaseCalculator {

	public Triangle(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkTwoDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		int a = Integer.parseInt(input[0]); // the first side of a triangle
		int b = Integer.parseInt(input[1]); // the second side of a triangle

		if (!doesTriangleExist(a, b)) {
			message += "Such triangle doesn't exist.";
			return message;
		}

		double perimeter = trianglePerimeter(a, b);
		long square = triangleSquare(a, b);

		message += "Given triangle: a = " + a + ", b = " + b;
		message += "\nPerimetr of triangle = " + perimeter;
		message += "\nSquare of triangle = " + square;
		return message;

	}

	public static long triangleSquare(int a, int b) {
		return (long) a * b/2;

	}

	public static double trianglePerimeter(int a, int b) {
		return a + b + Math.pow((a * a + b * b), 0.5);

	}

	public static boolean doesTriangleExist(int a, int b) {
		if (a > 0 && b > 0) {
			return true;
		}
		return false;
	}
	

}
