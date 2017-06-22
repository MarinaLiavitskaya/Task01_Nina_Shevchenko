package com.epam.shevchenko.calculator;

import com.epam.shevchenko.util.NumberUtil;

public class Triangle extends BaseCalculator {

	public Triangle(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkArgs()) {
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
	
	public boolean checkArgs() {

		if (!NumberUtil.isArgsEnough(input, 2)) {
			message += "Input should have two parameters!";
			return false;
		}
		if (!NumberUtil.isDigital(input[0]) || !NumberUtil.isDigital(input[1])) {
			message += "Input should have two numbers less then 8 digitals each!";
			return false;
		}
		return true;
	}

}
