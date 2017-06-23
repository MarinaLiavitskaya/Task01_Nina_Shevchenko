package com.epam.shevchenko.task;


import com.epam.shevchenko.calculator.functionality.Calculator;
import com.epam.shevchenko.exceptions.IncorrectDataException;
import com.epam.shevchenko.util.NumberParser;

public class MainTask05 {

	public static void main(String[] args) {

		try {
			double[] input = NumberParser.toThreeDoubleNumbers(args); 
			for (int i = 0; i < input.length; i++) {
				System.out.println(input[i] + " = " + Calculator.exponentiateAccordingPositivity(input[i]));
			}
			
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
