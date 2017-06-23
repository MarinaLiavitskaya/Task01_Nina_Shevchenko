package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;
import com.epam.shevchenko.util.NumberUtil;

public class SumOfTwo extends BaseCalculator {

	public SumOfTwo(String[] input) {
		this.input = input;
	}

	@Override
	public String calculate() {

		if (!checkThreeDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		int[] massive = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			massive[i] = Integer.parseInt(input[i]);
		}

	
		message += "The sum of the biggest and the smallest: " + sumTheBiggestAndTheSmallest(massive);
		return message;
	}

	

}
