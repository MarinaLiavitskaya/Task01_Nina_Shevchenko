package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;
import com.epam.shevchenko.util.NumberUtil;

public class MainTask10 {

	public static void main(String[] args) {

		try {
			int input = NumberParser.toIntNumbers(args, 1)[0];

			int[][] result = Calculator.createMatrix(input);
			System.out.print(NumberUtil.arrayToString(result));

		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
