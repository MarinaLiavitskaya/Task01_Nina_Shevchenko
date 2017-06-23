package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.beans.FourDigitalNumber;
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

}
