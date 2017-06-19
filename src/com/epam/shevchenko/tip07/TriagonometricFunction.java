package com.epam.shevchenko.tip07;

import com.epam.shevchenko.util.NumberUtil;

public class TriagonometricFunction {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Input should have three parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1]) || !NumberUtil.isDigital(args[2])) {
			System.out.println("Input should have three numbers less then 8 digitals each!");
			return;
		}

		double a = Double.parseDouble(args[0]); // line start
		double b = Double.parseDouble(args[1]); // line finish
		double h = Double.parseDouble(args[2]); // step

		int steps = (int) ((b - a) / h);
		double x = a; // functions argument

		System.out.println("x\t|\tF(x)");
		System.out.println("-------------------------");
		for (int i = 0; i < steps; i++) {
			System.out.println("" + x + "\t|\t" + countFunction(x));
			x += h;
		}

	}

	private static double countFunction(double x) {
		return Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
	}

}
