package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.beans.FourDigitalNumber;
import com.epam.shevchenko.beans.Point;
import com.epam.shevchenko.beans.Region;
import com.epam.shevchenko.beans.ThreeIntNumbersObject;
import com.epam.shevchenko.util.NumberUtil;

public abstract class Calculator {

	// task 01
	// Checks if the sum of the first two digitals is equal to the sum of
	// the last two
	public static boolean isFirstSumEqToLastSum(FourDigitalNumber numberToAnalyse) {

		int firstNumberPart = numberToAnalyse.getNumber() / 100;
		int secondNumberPart = numberToAnalyse.getNumber() % 100;

		return (NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart));
	}

	// task 02
	// (b + КОРЕНЬ(b2 + 4ac))/2a - a3c +b-2

	public static double calculateComplexFormula(ThreeIntNumbersObject input) {

		int a = input.getA();
		int b = input.getB();
		int c = input.getC();

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
	public static boolean isPointInRegion(Point p, Region region) {
		if ((p.getX() >= region.getX1()) && (p.getX() <= region.getX2())) {
			if ((p.getY() >= region.getY1()) && (p.getY() <= region.getY2())) {
				return true;
			}
		}
		return false;
	}

	// task 05
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
	public static int sumTheBiggestAndTheSmallest(int[] massive) {
		return massive[0] + massive[massive.length - 1];
	}

	// task 07
	public static double trigonometricFunction(double x) {
		return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
	}

	// task 08
	public static int sumNaturalNumbersMultipleK(int[] massive, int k) {
		int result = 0;

		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % k == 0) {
				result += massive[i];
			}
		}
		return result;
	}

}
