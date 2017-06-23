package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.functionality.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask09 {
	private static final int[] array1 = { 2, 5, 8, 10, 6, 2, 40 };
	private static final int[] array2 = { 5, 6, 7, 1, 3, 4 };

	public static void main(String[] args) {

		try {
			int input = NumberParser.toIntNumbers(args, 1)[0];
			int[] result = Calculator.concatArrays(array1, array2, input);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}

		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
