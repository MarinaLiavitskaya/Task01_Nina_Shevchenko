package com.epam.shevchenko.calculator;

import com.epam.shevchenko.util.NumberUtil;

public abstract class BaseCalculator implements Calculatable {

	protected String[] input;
	protected String message = "";

	protected boolean checkNaturalDigitalArgs() {

		for (int i = 0; i < input.length; i++) {
			if (!NumberUtil.isDigital(input[i])) {
				System.out.println("Input should have only natural digitals!");
				return false;
			}
		}
		return true;
	}

	protected boolean checkTwoDigitalArgs() {

		if (!NumberUtil.isArgsEnough(input, 2)) {
			message += "Input should have two parameters!";
			return false;
		}
		if (!NumberUtil.isDigital(input[0]) || !NumberUtil.isDigital(input[1])) {
			message += "Input should have two numbers less then 8 digitals each!";
			return false;
		}
		return true;
	}

	public boolean checkThreeDigitalArgs() {

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
