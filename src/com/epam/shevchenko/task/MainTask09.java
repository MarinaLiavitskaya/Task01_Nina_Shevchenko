package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.ArraysConcat;

public class MainTask09 {
	private static int[] array1 = { 2, 5, 8, 10, 6, 2, 40 };
	private static int[] array2 = { 5, 6, 7, 1, 3, 4 };

	public static void main(String[] args) {

		BaseCalculator calculator = new ArraysConcat(args, array1, array2);
		System.out.println(calculator.calculate());
		
	}
}
