package com.epam.shevchenko.calculator;

import com.epam.shevchenko.util.NumberUtil;

public class NumberAnalyser extends BaseCalculator{
	
	public NumberAnalyser(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkArgs(input)) {
			message += "Error! Incorrect input!";
			return message;
		}

		int numberToAnalyse = Integer.parseInt(input[0]);
		int firstNumberPart = numberToAnalyse / 100;
		int secondNumberPart = numberToAnalyse % 100;

		// Checks if the sum of the first two digitals is equal to the sum of
		// the last two

		String result = "" + (NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart));
		return result;
	}

	public boolean checkArgs(String[] input) {

		if (!NumberUtil.isArgsEnough(input, 1) || !NumberUtil.isFourDigitalNumber(input[0])) {
			System.out.println("Input should contain one positive four-digital number!");
			return false;
		}

		return true;
	}

}
