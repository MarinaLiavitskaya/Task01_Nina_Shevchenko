package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.calculator.NumberAnalyser;

public class MainTask01 {

	public static void main(String[] args) {

		BaseCalculator analyser = new NumberAnalyser(args);
		System.out.println(analyser.calculate());
		
	}
}
