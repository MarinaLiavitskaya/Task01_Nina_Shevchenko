package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask08 {
	private static int k = 3; //hardcore data

	public static void main(String[] args) {
		try {

			int[] input = NumberParser.toIntNumbers(args);
		
			System.out.println(Calculator.sumNaturalNumbersMultipleK(input, k));
	
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
