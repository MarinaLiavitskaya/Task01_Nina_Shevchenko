package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.Formula;

public class MainTask02 {

	public static void main(String[] args) {

		BaseCalculator calculator = new Formula(args);
		System.out.println(calculator.calculate());
	}

}
