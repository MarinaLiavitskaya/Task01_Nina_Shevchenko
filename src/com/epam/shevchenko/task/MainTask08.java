package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.NatureNumbersSum;

public class MainTask08 {
	private static int k = 3; //hardcore data

	public static void main(String[] args) {

		BaseCalculator calculator = new NatureNumbersSum(args, k);
		System.out.println(calculator.calculate());
		
	}
}
