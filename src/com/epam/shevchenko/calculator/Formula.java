package com.epam.shevchenko.calculator;

import com.epam.shevchenko.util.NumberUtil;

public class Formula {

	private String[] input;
	private String message = "";

	public Formula(String[] input) {
		this.input = input;
	}

	public boolean checkArgs() {

		if (!NumberUtil.isArgsEnough(input, 3)) {
			message += "Input should have three parameter!";
			return false;
		}
		if (!NumberUtil.isDigital(input[0]) || !NumberUtil.isDigital(input[1]) || !NumberUtil.isDigital(input[2])) {
			message += "Input should have three numbers less then 8 digitals each!";
			return false;
		}
		return true;
	}

	public String calculate() {
		
		if(!checkArgs()){
			message += "Error! Incorrect input!";
			return message;
		}

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		// (b + КОРЕНЬ(b2 + 4ac))/2a - a3c +b-2
		String result = "" + ((b + Math.pow((b * b + 4 * a * c), 0.5)) / (2 * a) - c * Math.pow(a, 3) + Math.pow(b, -2));
		return result;
	}

}
