package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;
import com.epam.shevchenko.util.NumberUtil;

public class MainTask06 {

	public static void main(String[] args) {

		try {
			int[] input = NumberParser.toIntArray(args);
			NumberUtil.sortMassive(input);
			System.out.println(Calculator.sumTheBiggestAndTheSmallest(input));

		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
