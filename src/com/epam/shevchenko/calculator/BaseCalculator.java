package com.epam.shevchenko.calculator;

import com.epam.shevchenko.util.NumberUtil;

public abstract class BaseCalculator {

	protected String[] input;
	protected String message = "";





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
