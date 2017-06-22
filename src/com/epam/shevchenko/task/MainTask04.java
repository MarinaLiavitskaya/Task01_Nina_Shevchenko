package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.functionality.RegionDefiner;

public class MainTask04 {

	public static void main(String[] args) {

		BaseCalculator calculator = new RegionDefiner(args);
		System.out.println(calculator.calculate());
		
	}
}
