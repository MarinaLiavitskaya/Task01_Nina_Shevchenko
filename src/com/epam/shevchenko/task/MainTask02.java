package com.epam.shevchenko.task;

import com.epam.shevchenko.calculator.Formula;

public class MainTask02 {

	public static void main(String[] args) {

		Formula formula = new Formula(args);

		System.out.println(formula.calculate());
	}

}
