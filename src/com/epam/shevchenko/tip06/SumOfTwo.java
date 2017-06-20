package com.epam.shevchenko.tip06;

import com.epam.shevchenko.util.NumberUtil;

public class SumOfTwo {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Input should have three parameter!");
			return;
		}

		if (!NumberUtil.isDigital(args[0]) || !NumberUtil.isDigital(args[1]) || !NumberUtil.isDigital(args[2])) {
			System.out.println("Input should have three numbers less then 8 digitals each!");
			return;
		}

		int[] massive = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			massive[i] = Integer.parseInt(args[i]);
		}

		NumberUtil.sortMassive(massive);
		System.out.println(sumTheBiggestAndTheSmallest(massive));

	}

	public static int sumTheBiggestAndTheSmallest(int[] massive) {
		return massive[0] + massive[massive.length - 1];
	}

	
}
