package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask07 {
	private static final String HEAD_STRING_FORMAT = "%s\t|\t%s\n---------------------\n";
	private static final String BODY_STRING_FORMAT = "%s\t|\t%.3f\n";

	public static void main(String[] args) {

		try {

			double[] input = NumberParser.toDoubleNumbers(args, 3);

			System.out.printf(HEAD_STRING_FORMAT, "x", "F(x)");

			for (double x = input[0]; x < input[1]; x += input[2]) {
				System.out.printf(BODY_STRING_FORMAT, x, Calculator.trigonometricFunction(x));
			}
			
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
	}
}
