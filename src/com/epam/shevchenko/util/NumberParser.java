package com.epam.shevchenko.util;

import com.epam.shevchenko.beans.FourDigitalNumber;
import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.RectangularTriangle;
import com.epam.shevchenko.beans.ThreeIntNumbersObject;
import com.epam.shevchenko.exceptions.IncorrectDataException;

public class NumberParser {

	public static int[] toIntNumbers(String[] input, int quantity) {

		if (!NumberUtil.checkDigitalArgs(input, quantity) || !NumberUtil.isArgsNaturalDigital(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}

		int[] result = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			result[i] = Integer.parseInt(input[i]);
		}

		return result;
	}

	public static double[] toDoubleNumbers(String[] input, int quantity) {

		if (!NumberUtil.checkDigitalArgs(input, quantity) || !NumberUtil.isArgsRealNumbers(input)) {
			throw new IncorrectDataException("Error. Enter" +  quantity +" double number.", input);
		}

		double[] result = new double[input.length];
		for (int i = 0; i < input.length; i++) {
			result[i] = Double.parseDouble(input[i]);
		}

		return result;

	}

	// for task 01
	public static FourDigitalNumber toFourDigitalNumber(String[] input) {

		if (!NumberUtil.checkDigitalArgs(input, 1) || !NumberUtil.isFourDigitalNumber(input[0])) {
			throw new IncorrectDataException("Error. Enter one four-digital positive number.", input);
		}

		return new FourDigitalNumber(Integer.parseInt(input[0]));
	}

	// for task 02
	public static ThreeIntNumbersObject toThreeIntNumberObject(String[] input) {

		if (!NumberUtil.checkDigitalArgs(input, 3) || !NumberUtil.isArgsNaturalDigital(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}

		return new ThreeIntNumbersObject(Integer.parseInt(input[0]), Integer.parseInt(input[1]),
				Integer.parseInt(input[2]));

	}

	// for task 03
	public static RectangularTriangle toTriangle(String[] input) {
		if (!NumberUtil.checkDigitalArgs(input, 2) || !NumberUtil.isArgsNaturalDigital(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}

		int a = Integer.parseInt(input[0]); // the first side of a triangle
		int b = Integer.parseInt(input[1]); // the second side of a triangle

		if (!NumberUtil.doesTriangleExist(a, b)) {
			throw new IncorrectDataException("Error. Such triangle doesn't exist", input);
		}

		return new RectangularTriangle(a, b);
	}

	// for task 04
	public static Point toPoint(String[] input) {

		if (!NumberUtil.checkDigitalArgs(input, 2) || !NumberUtil.isArgsNaturalDigital(input)) {
			throw new IncorrectDataException("Error. Enter two integer number.", input);
		}

		return new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
	}

	// for task 05
	public static double[] toThreeDoubleNumbers(String[] input) {

		if (!NumberUtil.checkDigitalArgs(input, 3) || !NumberUtil.isArgsRealNumbers(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}

		double[] result = new double[input.length];
		for (int i = 0; i < input.length; i++) {
			result[i] = Double.parseDouble(input[i]);
		}

		return result;
	}

	// for task 06
	public static int[] toIntArray(String[] input) {
		if (!NumberUtil.isArgsNaturalDigital(input)) {
			throw new IncorrectDataException("Error. Enter three integer number.", input);
		}

		int[] result = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			result[i] = Integer.parseInt(input[i]);
		}

		return result;
	}

}
