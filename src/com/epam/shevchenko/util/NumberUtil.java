package com.epam.shevchenko.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtil {

	private static final String INTEGER_NUMBER_PATTERN = "^-?\\d{1,8}$";
	private static final String INTEGER_FOUR_DIGITAL_NUMBER_PATTERN = "^(?!0+$)\\d{4}$";

	private static final String REAL_NUMBER_PATTERN = "^(?!0+.0+$)-?\\d{1,8}(.\\d{1,8})?$";

	// ********************
	// different checks

	public static boolean isArgsEnough(String[] args, int quantity) {
		if (args.length != quantity) {
			return false;
		}
		return true;
	}

	public static boolean isArgsIntegerDigital(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (!NumberUtil.isIntegerNumber(input[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean isArgsRealNumbers(String[] input) {

		for (int i = 0; i < input.length; i++) {
			if (!NumberUtil.isRealNumber(input[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean isFourDigitalNumber(String input) {
		Pattern p = Pattern.compile(INTEGER_FOUR_DIGITAL_NUMBER_PATTERN);
		Matcher m = p.matcher(input.trim());
		return m.matches();
	}

	// ************************************
	// some functionality

	public static boolean doesTriangleExist(int a, int b) {
		if (a > 0 && b > 0) {
			return true;
		}
		return false;
	}

	public static int sumDigitals(int numberPart) {
		int sum = 0;
		while (numberPart > 0) {
			sum += numberPart % 10;
			numberPart = numberPart / 10;
		}
		return sum;
	}

	// bubble sort
	public static void sortMassive(int[] massive) {
		for (int i = 0; i < massive.length; i++) {
			for (int j = 1; j < massive.length - i; j++) {
				if (massive[j] < massive[j - 1]) {
					int a = massive[j]; // temporary int
					massive[j] = massive[j - 1];
					massive[j - 1] = a;
				}
			}
		}
	}

	public static String arrayToString(int[][] array) {
		String arrayToString = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				arrayToString += array[i][j];
			}
			arrayToString += "\n";
		}
		return arrayToString;
	}

	// ***************************************
	// private methods
	private static boolean isIntegerNumber(String arg) {
		Pattern p = Pattern.compile(INTEGER_NUMBER_PATTERN);
		Matcher m = p.matcher(arg.trim());
		return m.matches();
	}

	private static boolean isRealNumber(String arg) {
		Pattern p = Pattern.compile(REAL_NUMBER_PATTERN);
		Matcher m = p.matcher(arg.trim());
		return m.matches();
	}

	public static boolean isArgsEnough(String[] input) {		
		if ( input.length > 0){
			return true;
		}
		return false;
	}
}
