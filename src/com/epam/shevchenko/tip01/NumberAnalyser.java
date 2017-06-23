package com.epam.shevchenko.tip01;

import com.epam.shevchenko.util.NumberUtil;

// for merge test
public class NumberAnalyser {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Input should have one parameter!");
			return;
		}

		System.out.println(analyseArgs(args[0]));

	}

	public static boolean analyseArgs(String arg) {

		if (!NumberUtil.isFourDigitalNumber(arg)) {
			System.out.println("Input is not a four-digital number!");
			//return false;
			throw new IllegalArgumentException();
		}

		int numberToAnalyse = Integer.parseInt(arg);
		int firstNumberPart = numberToAnalyse / 100;
		int secondNumberPart = numberToAnalyse % 100;
		
		

		// Checks if the sum of the first two digitals is equal to the sum of
		// last two
		return (NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart));

	}

}
