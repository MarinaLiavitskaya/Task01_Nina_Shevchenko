package com.epam.shevchenko.tip01;

import com.epam.shevchenko.util.NumberUtil;

public class NumberAnalyser {

	private String[] input;
	private String message = "";

	public NumberAnalyser(String[] input) {
		this.input = input;
	}

	public String analyse() {

		if (!checkArgs(input)) {
			message += "Error! Incorrect input!";
			return message;
		}

		int numberToAnalyse = Integer.parseInt(input[0]);
		int firstNumberPart = numberToAnalyse / 100;
		int secondNumberPart = numberToAnalyse % 100;

		// Checks if the sum of the first two digitals is equal to the sum of
		// the last two
		
		message += (NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart));
		return message;
	}

	public boolean checkArgs(String[] input) {

		if (!NumberUtil.isOneArg(input) || !NumberUtil.isFourDigitalNumber(input[0])) {
			System.out.println("Input should contain one positive four-digital number!");
			return false;
		}

		return true;
	}

}
