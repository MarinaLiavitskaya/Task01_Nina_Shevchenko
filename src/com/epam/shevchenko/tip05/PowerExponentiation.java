package com.epam.shevchenko.tip05;

import com.epam.shevchenko.util.NumberUtil;

public class PowerExponentiation {

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Input should have three parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1]) || !NumberUtil.isDigital(args[2])) {
			System.out.println("Input should have three numbers less then 8 digitals each!");
			return;
		}

		for (int i = 0; i < args.length; i++) {
			int number = Integer.parseInt(args[i]);
			System.out.println(exponentiate(number));
		}
	}

	public static long exponentiate(int number) {
		long result = 0;
		if (number >= 0) {
			result = (long) Math.pow(number, 2);
		} else {
			result = (long) Math.pow(number, 4);
		}
		return result;
	}
}
