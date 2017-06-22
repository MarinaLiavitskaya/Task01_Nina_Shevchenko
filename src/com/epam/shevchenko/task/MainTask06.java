package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.SumOfTwo;

public class MainTask06 {

	public static void main(String[] args) {

		BaseCalculator calculator = new SumOfTwo(args);
		System.out.println(calculator.calculate());
		
	}
}
