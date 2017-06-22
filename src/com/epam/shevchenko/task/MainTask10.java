package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.TheMatrix;

public class MainTask10 {

	public static void main(String[] args) {

		BaseCalculator calculator = new TheMatrix(args);
		System.out.println(calculator.calculate());
		
	}
}
