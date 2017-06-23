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

	

		double perimeter = trianglePerimeter(a, b);
		long square = triangleSquare(a, b);

		message += "Given triangle: a = " + a + ", b = " + b;
		message += "\nPerimetr of triangle = " + perimeter;
		message += "\nSquare of triangle = " + square;
		return message;

	}

	public static long triangleSquare(int a, int b) {
		

	}

	public static double trianglePerimeter(int a, int b) {
	

	}


	

}
