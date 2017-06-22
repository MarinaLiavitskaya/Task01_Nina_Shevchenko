package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;

public class NatureNumbersSum extends BaseCalculator {
	private int k; 

	public NatureNumbersSum(String[] input, int k) {
		this.input = input;
		this.k = k;
	}

	@Override
	public String calculate() {

		if (!checkNaturalDigitalArgs()) {
			message += "Error! Incorrect input!";
			return message;
		}

		int[] massive = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			massive[i] = Integer.parseInt(input[i]);
		}

		message += "The sum of numbers, that are multiple to " + k + " = " + sumNumbers(massive);
		return message;
	}

	public int sumNumbers(int[] massive) {
		int result = 0;

		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % k == 0) {
				result += massive[i];
			}
		}
		return result;
	}

}
