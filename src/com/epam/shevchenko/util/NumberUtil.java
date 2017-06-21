package com.epam.shevchenko.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtil {

	public static boolean isFourDigitalNumber(String arg) {
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(arg.trim());
		return m.matches();
	}

	public static int sumDigitals(int numberPart) {

		int sum = 0;
		while (numberPart >  0) {
			sum += numberPart % 10;
			numberPart = numberPart / 10;
		}
		return sum;
	}

	public static boolean isDigital(String arg) {
		Pattern p = Pattern.compile("^-?\\d{1,8}$");
		Matcher m = p.matcher(arg.trim());
		return m.matches();
	}
	
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
}
