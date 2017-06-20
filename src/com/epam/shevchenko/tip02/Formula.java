package com.epam.shevchenko.tip02;

import com.epam.shevchenko.util.NumberUtil;

public class Formula {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Input should have three parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1]) || !NumberUtil.isDigital(args[2])) {
			System.out.println("Input should have three numbers less then 8 digitals each!");
			return;
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		System.out.println("Result : " + calculate(a, b, c));

	}

	public static double calculate(double a, double b, double c) {
		// (b + КОРЕНЬ(b2 + 4ac))/2a - a3c +b-2
		double result = (b + Math.pow((b * b + 4 * a * c), 0.5)) / (2 * a) - c * Math.pow(a, 3) + Math.pow(b, -2);
		return result;
	}

}
