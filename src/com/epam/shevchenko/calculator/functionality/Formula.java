package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.util.NumberUtil;

public class Formula extends BaseCalculator {

	public Formula(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkTwoDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		// (b + КОРЕНЬ(b2 + 4ac))/2a - a3c +b-2
		String result = ""
				+ ((b + Math.pow((b * b + 4 * a * c), 0.5)) / (2 * a) - c * Math.pow(a, 3) + Math.pow(b, -2));
		return result;
	}
	

	public boolean checkTwoDigitalArgs() {

		if (!NumberUtil.isArgsEnough(input, 3)) {
			message += "Input should have three parameters!";
			return false;
		}
		if (!NumberUtil.isDigital(input[0]) || !NumberUtil.isDigital(input[1]) || !NumberUtil.isDigital(input[2])) {
			message += "Input should have three numbers less then 8 digitals each!";
			return false;
		}
		return true;
	}

}
