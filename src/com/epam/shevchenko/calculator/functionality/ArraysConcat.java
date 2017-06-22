package com.epam.shevchenko.calculator.functionality;

import com.epam.shevchenko.calculator.BaseCalculator;

public class ArraysConcat extends BaseCalculator {

	private int[] array1;
	private int[] array2;

	public ArraysConcat(String[] input, int[] array1, int[] array2) {
		this.input = input;
		this.array1 = array1;
		this.array2 = array2;
	}

	@Override
	public String calculate() {

		if (!checkDigitalArgs(input, 1)) {
			message += "Error! Incorrect input!";
			return message;
		}

		int k = Integer.parseInt(input[0]);

		if (k < 0) {
			message += "Input should be a natural number!";
			return message;
		}
		if (k > array1.length) {
			message += "Input should be less than first array length!";
			return message;
		}

		int[] concatArray = concatArrays(k);

		for (int i = 0; i < concatArray.length; i++) {
			message += concatArray[i] + " ";
		}

		return message;
	}

	public int[] concatArrays(int k) {
		int[] result = new int[array1.length + array2.length];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = array1[i];
			} else if (i < k + array2.length) {
				result[i] = array2[i - k];
			} else {
				result[i] = array1[i - array2.length];
			}
		}
		return result;
	}

}
