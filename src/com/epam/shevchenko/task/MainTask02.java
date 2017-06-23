package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.functionality.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask02 {

	public static void main(String[] args) {

		try {
			double result = Calculator.calculateComplexFormula(NumberParser.toThreeIntNumberObject(args));
			System.out.println(result);
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
	}

}
