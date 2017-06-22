package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.Triangle;

public class MainTask03 {

	public static void main(String[] args) {

		BaseCalculator calculator = new Triangle(args);
		System.out.println(calculator.calculate());
		
	}
}
