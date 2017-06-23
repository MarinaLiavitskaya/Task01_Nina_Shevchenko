package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask01 {

	public static void main(String[] args) {

		try {
			boolean result = Calculator.isFirstSumEqToLastSum(NumberParser.toFourDigitalNumber(args));
			System.out.println(result);
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
