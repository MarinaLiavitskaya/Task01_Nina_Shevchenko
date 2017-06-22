package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.util.NumberUtil;

public class PowerExponentiation extends BaseCalculator {

	public PowerExponentiation(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkThreeRealNumbersArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		for (int i = 0; i < input.length; i++) {
			double number = Double.parseDouble(input[i]);
			message += "for " + number + " result is: " + exponentiate(number) + "\n";
		}
		
		return message;
	}

	public double exponentiate(double number) {
		double result = 0;
		if (number >= 0) {
			result =  Math.pow(number, 2);
		} else {
			result =  Math.pow(number, 4);
		}
		return result;
	}

	public boolean checkThreeRealNumbersArgs() {

		if (!NumberUtil.isArgsEnough(input, 3)) {
			message += "Input should have three parameters!";
			return false;
		}
		if (!NumberUtil.isRealNumber(input[0]) || !NumberUtil.isRealNumber(input[1])
				|| !NumberUtil.isRealNumber(input[2])) {
			message += "Input should have three real numbers less then 8 digitals each!";
			return false;
		}
		return true;
	}

}
