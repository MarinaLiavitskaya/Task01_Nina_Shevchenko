package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.PowerExponentiation;

public class MainTask05 {

	public static void main(String[] args) {

		BaseCalculator calculator = new PowerExponentiation(args);
		System.out.println(calculator.calculate());
		
	}
}
