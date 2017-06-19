package com.epam.shevchenko.tip01;

import com.epam.shevchenko.util.NumberUtil;

/**
 * @author Nina
 *
 */
public class NumberAnalyser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Input should have one parameter!");
			return;
		}

		analyseArgs(args[0]);

	}

	private static void analyseArgs(String arg) {

		if (!NumberUtil.isFourDigitalNumber(arg)) {
			System.out.println("Input is not a four-digital number!");
			return;
		}

		int numberToAnalyse = Integer.parseInt(arg);
		int firstNumberPart = numberToAnalyse / 100;
		int secondNumberPart = numberToAnalyse % 100;

		// Checks if the sum of the first two digitals is equal to the sum of last two
		System.out.println(NumberUtil.sumDigitals(firstNumberPart) == NumberUtil.sumDigitals(secondNumberPart)); 
	
	}

}
