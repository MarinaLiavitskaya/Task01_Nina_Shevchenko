package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.util.NumberUtil;

public class TriagonometricFunction extends BaseCalculator {

	public TriagonometricFunction(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkThreeDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		double a = Double.parseDouble(input[0]); // line start
		double b = Double.parseDouble(input[1]); // line finish
		double h = Double.parseDouble(input[2]); // step

		message += String.format("%s\t|\t%s\n", "x", "F(x)");
		message += "-------------------------\n";
		for (double x = a; x < b; x += h) {
			message += String.format("%s\t|\t%.3f\n", x, countFunction(x));
		}

		return message;
	}

	public static double countFunction(double x) {
		return Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
	}

	// override method to check real numbers instead of natural numbers
	@Override
	public boolean checkThreeDigitalArgs() {

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
