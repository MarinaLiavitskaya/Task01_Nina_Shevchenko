package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.TriagonometricFunction;

public class MainTask07 {

	public static void main(String[] args) {

		BaseCalculator calculator = new TriagonometricFunction(args);
		System.out.println(calculator.calculate());
		
	}
}
